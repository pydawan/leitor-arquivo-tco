package br.gov.go.pge.tco.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thiago-amm
 * @version v1.0.0 04/04/2018
 * @since v1.0.0
 */
public class CarteiraOAB {
    
    private String numero;
    private String uf;
    private String complemento;
    
    public static List<CarteiraOAB> LISTA_VAZIA_CARTEIRAS_OAB = new ArrayList<>(0);
    
    public CarteiraOAB(String numero, String uf, String complemento) {
        this.numero = numero;
        this.uf = uf;
        this.complemento = complemento;
    }
    
    public CarteiraOAB() {
        this("", "", "");
    }
    
    public static CarteiraOAB of(String numero, String uf, String complemento) {
        return new CarteiraOAB(numero, uf, complemento);
    }
    
    public static CarteiraOAB of() {
        return new CarteiraOAB();
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
    
    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public String numero() {
        return getNumero();
    }
    
    public CarteiraOAB numero(String numero) {
        setNumero(numero);
        return this;
    }
    
    public String uf() {
        return getUf();
    }
    
    public CarteiraOAB uf(String uf) {
        setUf(uf);
        return this;
    }
    
    public String complemento() {
        return getComplemento();
    }
    
    public CarteiraOAB complemento(String complemento) {
        setComplemento(complemento);
        return this;
    }
    
    @Override
    public String toString() {
        return String.format("CarteiraOAB(numero=%s, uf=%s, complemento=%s)", numero, uf, complemento);
    }
    
}
