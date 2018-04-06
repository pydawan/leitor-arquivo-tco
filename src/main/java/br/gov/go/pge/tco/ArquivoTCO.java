package br.gov.go.pge.tco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author thiago-amm
 * @version v1.0.0 03/04/2018
 * @since v1.0.0
 */
public class ArquivoTCO {
    
    private File file;
    private List<String> linhas;
    private List<RegistroTCO> registros;
    
    public static final String LINHA_IDENTIFICADORA = "0;6;";
    public static final String EXTENSAO = ".tco";
    public static final String SEPARADOR_COLUNAS = ";";
    public static final List<ArquivoTCO> LISTA_VAZIA_ARQUIVOS_TCO = new ArrayList<>(0);
    
    public ArquivoTCO() {
        file = null;
        linhas = new ArrayList<>();
        registros = new ArrayList<>();
    }
    
    public ArquivoTCO(File file) throws IllegalArgumentException {
        this();
        if (file == null) {
            throw new IllegalArgumentException("ATENÇÃO: Não é possível ler um arquivo a partir de uma referência nula!");
        } else {
            if (file.exists() && file.isFile() && file.getName().endsWith(".tco")) {
                this.file = file;
            } else {
                this.file = null;
            }
        }
    }
    
    public ArquivoTCO(String path) throws IllegalArgumentException {
        this(new File(path == null ? "" : path));
    }
    
    public static ArquivoTCO of() {
        return new ArquivoTCO();
    }
    
    public static ArquivoTCO of(File file) {
        return new ArquivoTCO();
    }
    
    public static ArquivoTCO of(String path) {
        return new ArquivoTCO(path);
    }
    
    public File getFile() {
        return file;
    }
    
    public List<RegistroTCO> getRegistros() {
        return registros;
    }
    
    public void setRegistros(List<RegistroTCO> registros) {
        this.registros = registros;
    }
    
    public List<String> getLinhas() {
        return linhas;
    }
    
    public void setLinhas(List<String> linhas) {
        this.linhas = linhas;
    }
    
    public List<RegistroTCO> registros() {
        return getRegistros();
    }
    
    public ArquivoTCO registros(List<RegistroTCO> registros) {
        setRegistros(registros);
        return this;
    }
    
    public List<String> linhas() {
        return getLinhas();
    }
    
    public ArquivoTCO linhas(List<String> linhas) {
        setLinhas(linhas);
        return this;
    }
    
    public static String normalizarLinha(String linha) {
        linha = linha.replaceAll(" ;", ";");
        linha = linha.replaceAll("; ", ";");
        return linha;
    }
    
    private ArquivoTCO lerLinhas() {
        if (file != null) {
            FileInputStream fis = null;
            Scanner scanner = null;
            try {
                fis = new FileInputStream(file);
                scanner = new Scanner(fis);
                scanner.useDelimiter("\n");
                String linha = "";
                while (scanner.hasNext()) {
                    linha = scanner.nextLine();
                    linha = normalizarLinha(linha);
                    this.linhas().add(linha);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                    if (scanner != null) {
                        scanner.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return this;
    }
    
    public ArquivoTCO lerRegistros() {
        lerLinhas();
        if (!this.linhas.isEmpty()) {
            ListIterator<String> iterador = linhas.listIterator();
            String linha = "";
            RegistroTCO registro = null;
            while (iterador.hasNext()) {
                linha = iterador.next();
                if (!linha.equals("0;6;") && linha.matches("^\\d+;.*$") && !linha.startsWith("8;") && !linha.startsWith("9;")) {
                    if (linha.replaceAll("[^;]", "").length() == 14) {
                        registro = new RegistroTCO();
                        registro.preencherAgrupamento1(linha);
                        linha = iterador.next();
                        if (linha.startsWith(registro.getCodigoAgrupamento1() + "1;")) {
                            registro.preencherAgrupamento2(linha);
                            linha = iterador.next();
                        } else {
                            linha = iterador.previous();
                        }
                        if (linha.startsWith(registro.getCodigoAgrupamento1() + "2;")) {
                            registro.preencherAgrupamento3(linha);
                        } else {
                            linha = iterador.previous();
                        }
                        this.registros().add(registro);
                    }
                }
            }
        }
        return this;
    }
    
}
