package com.api.bcb.currency.exchange.currency;

import java.io.IOException;
import java.net.URISyntaxException;

import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrency;

/**
 * 1 - método public
 * 1 - modificador de fluxo
 * 2 - centena de linha na classe
 * 2 - meia centena de linha na método
 */
public class Currency implements CurrencyInterface {

    private Integer max = 100;

    private String expectedBody;

    //1
    @Override
    public SearchResultCurrency get() throws URISyntaxException, IOException, InterruptedException {
        return new RequesterToCurrencyApi(this.getRequestParams())
            .doRequest();
    }

    //1
    @Override
    public CurrencyInterface max(int numberElements) {
        this.max = numberElements;

        return this;
    }

    private String getRequestParams() {
        StringBuilder requestParam = new StringBuilder()
                .append("?$top=")
                .append(this.max.toString())
                .append("&format=");
            
        //1
        if(this.expectedBody != null) {
            requestParam.append(this.expectedBody);
        }

        return requestParam.toString();
    }

}
