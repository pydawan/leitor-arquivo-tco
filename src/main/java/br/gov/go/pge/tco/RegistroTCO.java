package br.gov.go.pge.tco;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import br.gov.go.pge.tco.modelo.CarteiraIdentidade;
import br.gov.go.pge.tco.modelo.CarteiraOAB;
import br.gov.go.pge.tco.modelo.CarteiraTrabalho;
import br.gov.go.pge.tco.modelo.Endereco;

/**
 * @author thiago-amm
 * @version v1.0.0 03/04/2018
 * @since v1.0.0
 */
public class RegistroTCO {
    
    private String codigoAgrupamento1;
    private String codigoAgrupamento2;
    private String codigoAgrupamento3;
    private String idReceitaFederal;
    private String nome;
    private CarteiraIdentidade rg;
    private String dataNascimento;
    private CarteiraTrabalho ctps;
    private String numeroTituloEleitor;
    private String nomeMae;
    private String sexo;
    private Endereco endereco;
    private CarteiraOAB oab;
    
    public static final List<RegistroTCO> LISTA_VAZIA_REGISTROS_TCO = new ArrayList<>(0);
    
    public RegistroTCO() {
        this.rg = new CarteiraIdentidade();
        this.ctps = new CarteiraTrabalho();
        this.endereco = new Endereco();
        this.oab = new CarteiraOAB();
    }
    
    public static RegistroTCO of() {
        return new RegistroTCO();
    }
    
    public String getCodigoAgrupamento1() {
        return codigoAgrupamento1;
    }
    
    public void setCodigoAgrupamento1(String codigoAgrupamento1) {
        this.codigoAgrupamento1 = codigoAgrupamento1;
    }
    
    public String getCodigoAgrupamento2() {
        return codigoAgrupamento2;
    }
    
    public void setCodigoAgrupamento2(String codigoAgrupamento2) {
        this.codigoAgrupamento2 = codigoAgrupamento2;
    }
    
    public String getCodigoAgrupamento3() {
        return codigoAgrupamento3;
    }
    
    public void setCodigoAgrupamento3(String codigoAgrupamento3) {
        this.codigoAgrupamento3 = codigoAgrupamento3;
    }
    
    public String getIdReceitaFederal() {
        return idReceitaFederal;
    }
    
    public void setIdReceitaFederal(String idReceitaFederal) {
        this.idReceitaFederal = idReceitaFederal;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public CarteiraIdentidade getRg() {
        return rg;
    }
    
    public void setRg(CarteiraIdentidade rg) {
        this.rg = rg;
    }
    
    public String getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public CarteiraTrabalho getCtps() {
        return ctps;
    }
    
    public void setCtps(CarteiraTrabalho ctps) {
        this.ctps = ctps;
    }
    
    public String getNumeroTituloEleitor() {
        return numeroTituloEleitor;
    }
    
    public void setNumeroTituloEleitor(String numeroTituloEleitor) {
        this.numeroTituloEleitor = numeroTituloEleitor;
    }
    
    public String getNomeMae() {
        return nomeMae;
    }
    
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public CarteiraOAB getOab() {
        return oab;
    }
    
    public void setOab(CarteiraOAB oab) {
        this.oab = oab;
    }
    
    public String codigoAgrupamento1() {
        return getCodigoAgrupamento1();
    }
    
    public RegistroTCO codigoAgrupamento1(String codigoAgrupamento1) {
        setCodigoAgrupamento1(codigoAgrupamento1);
        return this;
    }
    
    public String codigoAgrupamento2() {
        return getCodigoAgrupamento2();
    }
    
    public RegistroTCO codigoAgrupamento2(String codigoAgrupamento2) {
        setCodigoAgrupamento2(codigoAgrupamento2);
        return this;
    }
    
    public String codigoAgrupamento3() {
        return getCodigoAgrupamento3();
    }
    
    public RegistroTCO codigoAgrupamento3(String codigoAgrupamento3) {
        setCodigoAgrupamento3(codigoAgrupamento3);
        return this;
    }
    
    public String idReceitaFederal() {
        return getIdReceitaFederal();
    }
    
    public RegistroTCO idReceitaFederal(String idReceitaFederal) {
        setIdReceitaFederal(idReceitaFederal);
        return this;
    }
    
    public String nome() {
        return getNome();
    }
    
    public RegistroTCO nome(String nome) {
        setNome(nome);
        return this;
    }
    
    public CarteiraIdentidade rg() {
        return getRg();
    }
    
    public RegistroTCO rg(CarteiraIdentidade rg) {
        setRg(rg);
        return this;
    }
    
    public String dataNascimento() {
        return getDataNascimento();
    }
    
    public RegistroTCO dataNascimento(String dataNascimento) {
        setDataNascimento(dataNascimento);
        return this;
    }
    
    public CarteiraTrabalho ctps() {
        return getCtps();
    }
    
    public RegistroTCO ctps(CarteiraTrabalho ctps) {
        setCtps(ctps);
        return this;
    }
    
    public String numeroTituloEleitor() {
        return getNumeroTituloEleitor();
    }
    
    public RegistroTCO numeroTituloEleitor(String numeroTituloEleitor) {
        setNumeroTituloEleitor(numeroTituloEleitor);
        return this;
    }
    
    public String nomeMae() {
        return getNomeMae();
    }
    
    public RegistroTCO nomeMae(String nomeMae) {
        setNomeMae(nomeMae);
        return this;
    }
    
    public String sexo() {
        return getSexo();
    }
    
    public RegistroTCO sexo(String sexo) {
        setSexo(sexo);
        return this;
    }
    
    public Endereco endereco() {
        return getEndereco();
    }
    
    public RegistroTCO endereco(Endereco endereco) {
        setEndereco(endereco);
        return this;
    }
    
    public CarteiraOAB oab() {
        return getOab();
    }
    
    public RegistroTCO oab(CarteiraOAB oab) {
        setOab(oab);
        return this;
    }
    
    public void preencherAgrupamento1(String linha) {
        String[] colunas = RegistroTCO.obterColunasAgrupamento1(linha);
        if (colunas != null && colunas.length >= 14) {
            this.setCodigoAgrupamento1(colunas[0]);
            this.setIdReceitaFederal(colunas[1]);
            this.setNome(colunas[2]);
            this.getRg().setNumero(colunas[3]);
            this.getRg().setOrgaoExpedidor(colunas[4]);
            this.getRg().setUf(colunas[5]);
            this.setDataNascimento(colunas[6]);
            this.getCtps().setNumero(colunas[7]);
            this.getCtps().setUf(colunas[8]);
            this.getCtps().setSerie(colunas[9]);
            this.getCtps().setPis(colunas[10]);
            this.setNumeroTituloEleitor(colunas[11]);
            this.setNomeMae(colunas[12]);
            this.setSexo(colunas[13]);
        }
    }
    
    public void preencherAgrupamento2(String linha) {
        String[] colunas = RegistroTCO.obterColunasAgrupamento2(linha);
        if (colunas != null && colunas.length >= 8) {
            this.codigoAgrupamento2(colunas[0]);
            this.endereco().logradouro(colunas[1]);
            this.endereco().numero(colunas[2]);
            this.endereco().complemento(colunas[3]);
            this.endereco().bairro(colunas[4]);
            this.endereco().telefone(colunas[5]);
            if (colunas.length >= 11) {
                this.endereco().codigoCidade(colunas[6]);
                this.endereco().descricaoCidade(colunas[7]);
                this.endereco().uf(colunas[8]);
                this.endereco().cep(colunas[9]);
                this.endereco().email(colunas[10]);
            } else {
                this.endereco().cep(colunas[6]);
                this.endereco().email(colunas[7]);
            }
        }
    }
    
    public void preencherAgrupamento3(String linha) {
        String[] colunas = RegistroTCO.obterColunasAgrupamento3(linha);
        if (colunas != null && colunas.length >= 4) {
            this.codigoAgrupamento3(colunas[0]);
            this.oab().numero(colunas[1]);
            this.oab().uf(colunas[2]);
            this.oab().complemento(colunas[3]);
        }
    }
    
    /**
     * Obtém todas as colunas do agrupamento 1 de um arquivo TCO a partir de uma
     * linha de texto
     * com valores separados por caracteres ponto e vírgula.
     * 
     * Para isso efetua o seguinte processamento:
     * 1 - Cria-se um array de string com quatorze posições como sendo o retorno
     * deste método.
     * Cada posição é preenchida com uma string vazia.
     * 2 - Verifica-se o início o argumento do parâmetro linha deste método de forma
     * a garantir que não se inicie
     * com os valores 8; e 9; o que caracterizaria uma linha de resumo do arquivo
     * TCO.
     * 3 - Cria-se um array de entrada dividindo-se a linha com base no caractere
     * separador que é o ponto e vírgula.
     * 4 - Percorrem-se quatorze posições no array de entrada.
     * 4.1 - Se a posição seja válida (não lança a exceção
     * ArrayIndexOutOfBoundsException) então o valor é extraído na variável coluna,
     * tratado e
     * logo após atribuído ao array de saída.
     * 4.2 - Senão atribui-se a variável coluna uma string vazia.
     * 
     * @param linha
     *            linha lida a partir de um arquivo TCO
     * @return array contendo os valores extraídos da linha informada
     */
    public static String[] obterColunasAgrupamento1(String linha) {
        // array com 14 posições a ser retornado.
        String[] colunasAgrupamento1 = new String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
        linha = linha == null ? "" : linha;
        if (!linha.isEmpty()) {
            linha = linha.replace(" ;", ";");
            linha = linha.replace("; ", ";");
            linha = linha.replace(" ; ", ";");
            if (!linha.startsWith("8;") && !linha.startsWith("9;")) {
                String[] colunas = linha.split(";");
                String coluna = null;
                for (int i = 0; i < colunasAgrupamento1.length; i++) {
                    try {
                        coluna = colunas[i];
                        coluna = coluna == null ? "" : coluna;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        coluna = "";
                    }
                    if (!coluna.isEmpty()) {
                        colunasAgrupamento1[i] = coluna;
                    }
                }
            }
            
        }
        return colunasAgrupamento1;
    }
    
    public static String[] obterColunasAgrupamento2(String linha) {
        // array com 11 posições a ser retornado.
        String[] colunasAgrupamento2 = null;
        int quantidadePontosVirgula = linha.replaceAll("[^;]", "").length();
        if (quantidadePontosVirgula == 11) {
            colunasAgrupamento2 = new String[] { "", "", "", "", "", "", "", "", "", "", "" };
        } else if (quantidadePontosVirgula == 8) {
            colunasAgrupamento2 = new String[] { "", "", "", "", "", "", "", "" };
        }
        linha = linha == null ? "" : linha;
        if (!linha.isEmpty()) {
            linha = linha.replace(" ;", ";");
            linha = linha.replace("; ", ";");
            linha = linha.replace(" ; ", ";");
            if (!linha.startsWith("8;") || !linha.startsWith("9;")) {
                String[] colunas = linha.split(";");
                String coluna = null;
                for (int i = 0; i < colunasAgrupamento2.length; i++) {
                    try {
                        coluna = colunas[i];
                        coluna = coluna == null ? "" : coluna;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        coluna = "";
                    }
                    if (!coluna.isEmpty()) {
                        colunasAgrupamento2[i] = coluna;
                    }
                }
            }
        }
        return colunasAgrupamento2;
    }
    
    public static String[] obterColunasAgrupamento3(String linha) {
        // array com 4 posições a ser retornado.
        String[] colunasAgrupamento3 = new String[] { "", "", "", "" };
        linha = linha == null ? "" : linha;
        if (!linha.isEmpty()) {
            linha = linha.replace(" ;", ";");
            linha = linha.replace("; ", ";");
            linha = linha.replace(" ; ", ";");
            if (!linha.startsWith("8;") || !linha.startsWith("9;")) {
                String[] colunas = linha.split(";");
                String coluna = null;
                for (int i = 0; i < colunasAgrupamento3.length; i++) {
                    try {
                        coluna = colunas[i];
                        coluna = coluna == null ? "" : coluna;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        coluna = "";
                    }
                    if (!coluna.isEmpty()) {
                        colunasAgrupamento3[i] = coluna;
                    }
                }
            }
        }
        return colunasAgrupamento3;
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
