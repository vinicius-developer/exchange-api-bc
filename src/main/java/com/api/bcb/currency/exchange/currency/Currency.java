package com.api.bcb.currency.exchange.currency;

import java.io.IOException;
import java.security.InvalidParameterException;

import com.api.bcb.currency.commom.api.EntityApiInterface;
import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrencyInterface;

/**
 * 1 - método public
 * 1 - modificador de fluxo
 * 2 - centena de linha na classe
 * 2 - meia centena de linha na método
 * 
 * Classe criada para acessar a lista de meodas disponíveis na API
 * acessando o endpoint /Moedas. 
 * 
 * Essa classe faz a configuração das variáveis do path e chama o 
 * Cliente que vai efetivamente fazer o request para a API.
 */
public class Currency extends EntityApiInterface 
    implements CurrencyInterface {

    private Integer max = 100;

    //1
    @Override
    public SearchResultCurrencyInterface get() 
        throws IOException, InterruptedException {
        return new RequesterToCurrencyApi(this.getRequestParams())
            .doRequest();
    }

    //1
    @Override
    public CurrencyInterface max(Integer numberElements) {
        if(numberElements < 0) {
            throw new InvalidParameterException("Quantidade deve ser maior que zero");
        }

        this.max = numberElements;

        return this;
    }

    @Override
    protected String getRequestParams() {
        return new StringBuilder()
                .append("?$top=")
                .append(this.max.toString())
                .append("&format=json")
                .toString();
    }

}
