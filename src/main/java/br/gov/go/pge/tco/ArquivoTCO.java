package br.gov.go.pge.tco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
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
    
    // início: atributos agrupamento 8.
    private String codigoAreaAtuacaoJuizado;
    private String codigoAcao;
    private String valorAcao;
    private String envolvePartesComMais60Anos;
    private String segredoJustica;
    private String envolvePedidoUrgentica;
    private String codigoDelegacia;
    private String codigoInstituicao;
    private String numeroTCO;
    private String idAssunto;
    // fim: atributos agrupamento 8.
    
    // início: atributos agrupamento 9.
    private String quantidadePromoventes;
    private String quantidadePromovidos;
    private String quantidadeAdvogadosPromoventes;
    private String quantidadeAdvogadosPromovidos;
    private String quantidadeComunicantes;
    private String quantidadeTestemunhas;
    private String quantidadeLinhas;
    // fim: atributos agrupamento 9.
    
    public static final String PRIMEIRA_LINHA = "0;6;";
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
    
    public String getCodigoAreaAtuacaoJuizado() {
        return codigoAreaAtuacaoJuizado;
    }
    
    public void setCodigoAreaAtuacaoJuizado(String codigoAreaAtuacaoJuizado) {
        this.codigoAreaAtuacaoJuizado = codigoAreaAtuacaoJuizado;
    }
    
    public String getCodigoAcao() {
        return codigoAcao;
    }
    
    public void setCodigoAcao(String codigoAcao) {
        this.codigoAcao = codigoAcao;
    }
    
    public String getValorAcao() {
        return valorAcao;
    }
    
    public void setValorAcao(String valorAcao) {
        this.valorAcao = valorAcao;
    }
    
    public String getEnvolvePartesComMais60Anos() {
        return envolvePartesComMais60Anos;
    }
    
    public void setEnvolvePartesComMais60Anos(String envolvePartesComMais60Anos) {
        this.envolvePartesComMais60Anos = envolvePartesComMais60Anos;
    }
    
    public String getSegredoJustica() {
        return segredoJustica;
    }
    
    public void setSegredoJustica(String segredoJustica) {
        this.segredoJustica = segredoJustica;
    }
    
    public String getEnvolvePedidoUrgentica() {
        return envolvePedidoUrgentica;
    }
    
    public void setEnvolvePedidoUrgentica(String envolvePedidoUrgentica) {
        this.envolvePedidoUrgentica = envolvePedidoUrgentica;
    }
    
    public String getCodigoDelegacia() {
        return codigoDelegacia;
    }
    
    public void setCodigoDelegacia(String codigoDelegacia) {
        this.codigoDelegacia = codigoDelegacia;
    }
    
    public String getCodigoInstituicao() {
        return codigoInstituicao;
    }
    
    public void setCodigoInstituicao(String codigoInstituicao) {
        this.codigoInstituicao = codigoInstituicao;
    }
    
    public String getNumeroTCO() {
        return numeroTCO;
    }
    
    public void setNumeroTCO(String numeroTCO) {
        this.numeroTCO = numeroTCO;
    }
    
    public String getIdAssunto() {
        return idAssunto;
    }
    
    public void setIdAssunto(String idAssunto) {
        this.idAssunto = idAssunto;
    }
    
    public String getQuantidadePromoventes() {
        return quantidadePromoventes;
    }
    
    public void setQuantidadePromoventes(String quantidadePromoventes) {
        this.quantidadePromoventes = quantidadePromoventes;
    }
    
    public String getQuantidadePromovidos() {
        return quantidadePromovidos;
    }
    
    public void setQuantidadePromovidos(String quantidadePromovidos) {
        this.quantidadePromovidos = quantidadePromovidos;
    }
    
    public String getQuantidadeAdvogadosPromoventes() {
        return quantidadeAdvogadosPromoventes;
    }
    
    public void setQuantidadeAdvogadosPromoventes(String quantidadeAdvogadosPromoventes) {
        this.quantidadeAdvogadosPromoventes = quantidadeAdvogadosPromoventes;
    }
    
    public String getQuantidadeAdvogadosPromovidos() {
        return quantidadeAdvogadosPromovidos;
    }
    
    public void setQuantidadeAdvogadosPromovidos(String quantidadeAdvogadosPromovidos) {
        this.quantidadeAdvogadosPromovidos = quantidadeAdvogadosPromovidos;
    }
    
    public String getQuantidadeComunicantes() {
        return quantidadeComunicantes;
    }
    
    public void setQuantidadeComunicantes(String quantidadeComunicantes) {
        this.quantidadeComunicantes = quantidadeComunicantes;
    }
    
    public String getQuantidadeTestemunhas() {
        return quantidadeTestemunhas;
    }
    
    public void setQuantidadeTestemunhas(String quantidadeTestemunhas) {
        this.quantidadeTestemunhas = quantidadeTestemunhas;
    }
    
    public String getQuantidadeLinhas() {
        return quantidadeLinhas;
    }
    
    public void setQuantidadeLinhas(String quantidadeLinhas) {
        this.quantidadeLinhas = quantidadeLinhas;
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
    
    public String codigoAreaAtuacaoJuizado() {
        return getCodigoAreaAtuacaoJuizado();
    }
    
    public ArquivoTCO codigoAreaAtuacaoJuizado(String codigoAreaAtuacaoJuizado) {
        setCodigoAreaAtuacaoJuizado(codigoAreaAtuacaoJuizado);
        return this;
    }
    
    public String codigoAcao() {
        return getCodigoAcao();
    }
    
    public ArquivoTCO codigoAcao(String codigoAcao) {
        setCodigoAcao(codigoAcao);
        return this;
    }
    
    public String valorAcao() {
        return getValorAcao();
    }
    
    public ArquivoTCO valorAcao(String valorAcao) {
        setValorAcao(valorAcao);
        return this;
    }
    
    public String envolvePartesComMais60Anos() {
        return getEnvolvePartesComMais60Anos();
    }
    
    public ArquivoTCO envolvePartesComMais60Anos(String envolvePartesComMais60Anos) {
        setEnvolvePartesComMais60Anos(envolvePartesComMais60Anos);
        return this;
    }
    
    public String segredoJustica() {
        return getSegredoJustica();
    }
    
    public ArquivoTCO segredoJustica(String segredoJustica) {
        setSegredoJustica(segredoJustica);
        return this;
    }
    
    public String envolvePedidoUrgentica() {
        return getEnvolvePedidoUrgentica();
    }
    
    public ArquivoTCO envolvePedidoUrgentica(String envolvePedidoUrgentica) {
        setEnvolvePedidoUrgentica(envolvePedidoUrgentica);
        return this;
    }
    
    public String codigoDelegacia() {
        return getCodigoDelegacia();
    }
    
    public ArquivoTCO codigoDelegacia(String codigoDelegacia) {
        setCodigoDelegacia(codigoDelegacia);
        return this;
    }
    
    public String codigoInstituicao() {
        return getCodigoInstituicao();
    }
    
    public ArquivoTCO codigoInstituicao(String codigoInstituicao) {
        setCodigoInstituicao(codigoInstituicao);
        return this;
    }
    
    public String numeroTCO() {
        return getNumeroTCO();
    }
    
    public ArquivoTCO numeroTCO(String numeroTCO) {
        setNumeroTCO(numeroTCO);
        return this;
    }
    
    public String idAssunto() {
        return getIdAssunto();
    }
    
    public ArquivoTCO idAssunto(String idAssunto) {
        setIdAssunto(idAssunto);
        return this;
    }
    
    public String quantidadePromoventes() {
        return getQuantidadePromoventes();
    }
    
    public ArquivoTCO quantidadePromoventes(String quantidadePromoventes) {
        setQuantidadePromoventes(quantidadePromoventes);
        ;
        return this;
    }
    
    public String quantidadePromovidos() {
        return getQuantidadePromovidos();
    }
    
    public ArquivoTCO quantidadePromovidos(String quantidadePromovidos) {
        setQuantidadePromovidos(quantidadePromovidos);
        return this;
    }
    
    public String quantidadeAdvogadosPromoventes() {
        return getQuantidadeAdvogadosPromoventes();
    }
    
    public ArquivoTCO quantidadeAdvogadosPromoventes(String quantidadeAdvogadosPromoventes) {
        setQuantidadeAdvogadosPromoventes(quantidadeAdvogadosPromoventes);
        return this;
    }
    
    public String quantidadeAdvogadosPromovidos() {
        return getQuantidadeAdvogadosPromovidos();
    }
    
    public ArquivoTCO quantidadeAdvogadosPromovidos(String quantidadeAdvogadosPromovidos) {
        setQuantidadeAdvogadosPromovidos(quantidadeAdvogadosPromovidos);
        return this;
    }
    
    public String quantidadeComunicantes() {
        return getQuantidadeComunicantes();
    }
    
    public ArquivoTCO quantidadeComunicantes(String quantidadeComunicantes) {
        setQuantidadeComunicantes(quantidadeComunicantes);
        return this;
    }
    
    public String quantidadeTestemunhas() {
        return getQuantidadeTestemunhas();
    }
    
    public ArquivoTCO quantidadeTestemunhas(String quantidadeTestemunhas) {
        setQuantidadeTestemunhas(quantidadeTestemunhas);
        return this;
    }
    
    public String quantidadeLinhas() {
        return getQuantidadeLinhas();
    }
    
    public ArquivoTCO quantidadeLinhas(String quantidadeLinhas) {
        setQuantidadeLinhas(quantidadeLinhas);
        return this;
    }
    
    public static void normalizarLinha(String linha) {
        linha = linha.replace(" ;", ";");
        linha = linha.replace("; ", ";");
        linha = linha.replace(" ; ", ";");
    }
    
    public void preencherAgrupamento8(String linha) {
        String[] colunas = ArquivoTCO.obterColunasAgrupamento8(linha);
        if (colunas != null && colunas.length >= 11) {
            this.codigoAreaAtuacaoJuizado = colunas[1];
            this.codigoAcao = colunas[2];
            this.valorAcao = colunas[3];
            this.envolvePartesComMais60Anos = colunas[4];
            this.segredoJustica = colunas[5];
            this.envolvePedidoUrgentica = colunas[6];
            this.codigoDelegacia = colunas[7];
            this.codigoInstituicao = colunas[8];
            this.numeroTCO = colunas[9];
            this.idAssunto = colunas[10];
        }
    }
    
    public void preencherAgrupamento9(String linha) {
        String[] colunas = ArquivoTCO.obterColunasAgrupamento9(linha);
        if (colunas != null && colunas.length >= 8) {
            this.quantidadePromoventes = colunas[1];
            this.quantidadePromovidos = colunas[2];
            this.quantidadeAdvogadosPromoventes = colunas[3];
            this.quantidadeAdvogadosPromovidos = colunas[4];
            this.quantidadeComunicantes = colunas[5];
            this.quantidadeTestemunhas = colunas[6];
            this.quantidadeLinhas = colunas[7];
        }
    }
    
    public static String[] obterColunasAgrupamento8(String linha) {
        // array com 11 posições.
        String[] colunasAgrupamento8 = new String[] { "", "", "", "", "", "", "", "", "", "", "" };
        linha = linha == null ? "" : linha;
        if (!linha.isEmpty()) {
            normalizarLinha(linha);
            if (linha.startsWith("8;")) {
                String[] colunas = linha.split(";");
                String coluna = null;
                for (int i = 0; i < colunasAgrupamento8.length; i++) {
                    try {
                        coluna = colunas[i];
                        coluna = coluna == null ? "" : coluna;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        coluna = "";
                    }
                    if (!coluna.isEmpty()) {
                        colunasAgrupamento8[i] = coluna;
                    }
                }
            }
        }
        return colunasAgrupamento8;
    }
    
    public static String[] obterColunasAgrupamento9(String linha) {
        // array com 8 posições.
        String[] colunasAgrupamento9 = new String[] { "", "", "", "", "", "", "", "" };
        linha = linha == null ? "" : linha;
        if (!linha.isEmpty()) {
            normalizarLinha(linha);
            if (linha.startsWith("9;")) {
                String[] colunas = linha.split(";");
                String coluna = null;
                for (int i = 0; i < colunasAgrupamento9.length; i++) {
                    try {
                        coluna = colunas[i];
                        coluna = coluna == null ? "" : coluna;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        coluna = "";
                    }
                    if (!coluna.isEmpty()) {
                        colunasAgrupamento9[i] = coluna;
                    }
                }
            }
        }
        return colunasAgrupamento9;
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
                    normalizarLinha(linha);
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
                if (!linha.equals("0;6;") && linha.matches("^\\d+;.*$")) {
                    if (!linha.startsWith("8;") && !linha.startsWith("9;")) {
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
                    } else {
                        if (linha.startsWith("8;")) {
                            this.preencherAgrupamento8(linha);
                        }
                        if (linha.startsWith("9;")) {
                            this.preencherAgrupamento9(linha);
                        }
                    }
                }
            }
        }
        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s(", this.getClass().getSimpleName()));
        for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                if (!(field.get(this) instanceof List)) {
                    if (field.get(this) != null && field.get(this).toString().isEmpty()) {
                        sb.append(String.format("%s=, ", field.getName()));
                    } else {
                        sb.append(String.format("%s=%s, ", field.getName(), field.get(this)));
                    }
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        sb.replace(sb.lastIndexOf(", "), sb.length(), "");
        sb.append(")");
        return sb.toString();
    }
    
}
