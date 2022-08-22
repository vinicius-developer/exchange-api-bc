package com.api.bcb.currency.commom.api;

/**
 * Classe criada para juntar o endpoint com o path do Bacen
 */
public abstract class BcCentralApiV1 {
    
    protected String route = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata";

    public BcCentralApiV1(String path, String params) {

        this.route += path + params;

    }

}
