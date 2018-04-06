package br.gov.go.pge.tco;

import java.io.FileNotFoundException;

/**
 * @author thiago-amm
 * @version v1.0.0 03/04/2018
 * @since v1.0.0
 */
public class LeitorArquivoTCO {
    
    public static void main(String[] args) throws FileNotFoundException {
        /*
        ArquivoTCO arquivoTCO = new ArquivoTCO("src/main/resources/167075.tco");
        arquivoTCO.lerRegistros();
        arquivoTCO.registros().forEach(System.out::println);
        */
        
        ArquivoTCO.of("src/main/resources/167075.tco").lerRegistros().registros().forEach(System.out::println);
    }
}
