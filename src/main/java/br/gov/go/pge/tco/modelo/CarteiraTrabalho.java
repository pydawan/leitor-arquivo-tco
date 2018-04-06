package br.gov.go.pge.tco.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thiago-amm
 * @version v1.0.0 04/04/2018
 * @since v1.0.0
 */
public class CarteiraTrabalho {
    
    private String numero;
    private String uf;
    private String serie;
    private String pis;
    
    public static final List<CarteiraTrabalho> LISTA_VAZIA_CARTEIRAS_TRABALHO = new ArrayList<>(0);
    
    public CarteiraTrabalho(String numero, String uf, String serie, String pis) {
        this.numero = numero;
        this.uf = uf;
        this.serie = serie;
        this.pis = pis;
    }
    
    public CarteiraTrabalho() {
        this("", "", "", "");
    }
    
    public static CarteiraTrabalho of(String numero, String uf, String serie, String pis) {
        return new CarteiraTrabalho(numero, uf, serie, pis);
    }
    
    public static CarteiraTrabalho of() {
        return new CarteiraTrabalho();
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getUf() {
        return uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public String getSerie() {
        return serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    public String getPis() {
        return pis;
    }
    
    public void setPis(String pis) {
        this.pis = pis;
    }
    
    public String numero() {
        return getNumero();
    }
    
    public CarteiraTrabalho numero(String numero) {
        setNumero(numero);
        return this;
    }
    
    public String uf() {
        return getUf();
    }
    
    public CarteiraTrabalho uf(String uf) {
        setUf(uf);
        return this;
    }
    
    public String serie() {
        return getSerie();
    }
    
    public CarteiraTrabalho serie(String serie) {
        setSerie(serie);
        return this;
    }
    
    public String pis() {
        return getPis();
    }
    
    public CarteiraTrabalho pis(String pis) {
        setPis(pis);
        return this;
    }
    
    @Override
    public String toString() {
        return String.format("CarteiraTrabalho(numero=%s, uf=%s, serie=%s, pis=%s)", numero, uf, serie, pis);
    }
    
}
