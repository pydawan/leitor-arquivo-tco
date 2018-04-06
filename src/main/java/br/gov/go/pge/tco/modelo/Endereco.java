package br.gov.go.pge.tco.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thiago-amm
 * @version v1.0.0 04/04/2018
 * @since v1.0.0
 */
public class Endereco {
    
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String codigoCidade;
    private String descricaoCidade;
    private String uf;
    private String cep;
    
    public static final List<Endereco> LISTA_VAZIA_ENDERECOS = new ArrayList<>(0);
    
    public Endereco() {
        this.logradouro = "";
        this.numero = "";
        this.complemento = "";
        this.bairro = "";
        this.codigoCidade = "";
        this.descricaoCidade = "";
        this.uf = "";
        this.cep = "";
    }
    
    public static Endereco of() {
        return new Endereco();
    }
    
    public String getLogradouro() {
        return logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getCodigoCidade() {
        return codigoCidade;
    }
    
    public void setCodigoCidade(String codigoCidade) {
        this.codigoCidade = codigoCidade;
    }
    
    public String getDescricaoCidade() {
        return descricaoCidade;
    }
    
    public void setDescricaoCidade(String descricaoCidade) {
        this.descricaoCidade = descricaoCidade;
    }
    
    public String getUf() {
        return uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String logradouro() {
        return getLogradouro();
    }
    
    public Endereco logradouro(String logradouro) {
        setLogradouro(logradouro);
        return this;
    }
    
    public String numero() {
        return getNumero();
    }
    
    public Endereco numero(String numero) {
        setNumero(numero);
        return this;
    }
    
    public String complemento() {
        return getComplemento();
    }
    
    public Endereco complemento(String complemento) {
        setComplemento(complemento);
        return this;
    }
    
    public String bairro() {
        return getBairro();
    }
    
    public Endereco bairro(String bairro) {
        setBairro(bairro);
        return this;
    }
    
    public String codigoCidade() {
        return getCodigoCidade();
    }
    
    public Endereco codigoCidade(String codigoCidade) {
        setCodigoCidade(codigoCidade);
        return this;
    }
    
    public String descricaoCidade() {
        return getDescricaoCidade();
    }
    
    public Endereco descricaoCidade(String descricaoCidade) {
        setDescricaoCidade(descricaoCidade);
        return this;
    }
    
    public String uf() {
        return getUf();
    }
    
    public Endereco uf(String uf) {
        setUf(uf);
        return this;
    }
    
    public String cep() {
        return getCep();
    }
    
    public Endereco cep(String cep) {
        setCep(cep);
        return this;
    }
    
    @Override
    public String toString() {
        String format = "Endereco(logradouro=%s, numero=%s, complemento=%s, bairro=%s, codigoCidade=%s, descricaoCidade=%s, uf=%s, cep=%s)";
        return String.format(format, logradouro, numero, complemento, bairro, codigoCidade, descricaoCidade, uf, cep);
    }
    
}
