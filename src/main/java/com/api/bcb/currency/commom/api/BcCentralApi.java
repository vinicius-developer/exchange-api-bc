package com.api.bcb.currency.commom.api;

public abstract class BcCentralApi {
    
    protected String route = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/Moedas";

    public BcCentralApi(String params) {

        this.route += params;

    }

}
