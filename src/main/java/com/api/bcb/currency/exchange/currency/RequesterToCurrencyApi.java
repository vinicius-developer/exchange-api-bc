package com.api.bcb.currency.exchange.currency;

import java.io.IOException;
import java.net.http.HttpResponse;

import com.api.bcb.currency.commom.api.BcCentralApiV1;
import com.api.bcb.currency.commom.api.http.Client;
import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrency;
import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrencyInterface;

class RequesterToCurrencyApi extends BcCentralApiV1 {

    private Client client = new Client();

    public RequesterToCurrencyApi(String params) {
        super("/Moedas", params);
    }

    public SearchResultCurrencyInterface doRequest() 
            throws IOException, InterruptedException {

        HttpResponse<String> response = this.client.get(this.route);

        return new SearchResultCurrency(response.body());
    }

}
