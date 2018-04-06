package br.gov.go.pge.tco.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thiago-amm
 * @version v1.0.0 04/04/2018
 * @since v1.0.0
 */
public class CarteiraIdentidade {
    
    private String numero;
    private String orgaoExpedidor;
    private String uf;
    
    public static final List<CarteiraIdentidade> LISTA_VAZIA_CARTEIRAS_IDENTIDADE = new ArrayList<>(0);
    
    public CarteiraIdentidade(String numero, String orgaoExpedidor, String uf) {
        this.numero = numero;
        this.orgaoExpedidor = orgaoExpedidor;
        this.uf = uf;
    }
    
    public CarteiraIdentidade() {
        this("", "", "");
    }
    
    public static CarteiraIdentidade of(String numero, String orgaoExpedidor, String uf) {
        return new CarteiraIdentidade(numero, orgaoExpedidor, uf);
    }
    
    public static CarteiraIdentidade of() {
        return new CarteiraIdentidade();
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }
    
    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }
    
    public String getUf() {
        return uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public String numero() {
        return getNumero();
    }
    
    public CarteiraIdentidade numero(String numero) {
        setNumero(numero);
        return this;
    }
    
    public String orgaoExpedidor() {
        return getOrgaoExpedidor();
    }
    
    public CarteiraIdentidade orgaoExpedidor(String orgaoExpedidor) {
        setOrgaoExpedidor(orgaoExpedidor);
        return this;
    }
    
    public String uf() {
        return getUf();
    }
    
    public CarteiraIdentidade uf(String uf) {
        setUf(uf);
        return this;
    }
    
    @Override
    public String toString() {
        return String.format("Rg(numero=%s, orgaoExpedidor=%s, uf=%s)", numero, orgaoExpedidor, uf);
    }
    
}
