package com.api.bcb.currency.exchange.dollar.quote.day;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

import com.api.bcb.currency.commom.api.BcCentralApiV1;
import com.api.bcb.currency.commom.api.http.Client;
import com.api.bcb.currency.exchange.dollar.quote.day.ds.SearchResultDolarQuoteDay;
import com.api.bcb.currency.exchange.dollar.quote.day.ds.SearchResultDolarQuoteDayInterface;

class RequesterToDollarQuoteDayApi extends BcCentralApiV1 {

    private Client client = new Client();

    public RequesterToDollarQuoteDayApi(String params) {
        super("/CotacaoDolarDia(dataCotacao=@dataCotacao)", params);
    }

    public SearchResultDolarQuoteDayInterface doRequest() 
            throws URISyntaxException, IOException, InterruptedException {

        HttpResponse<String> response = this.client.get(this.route);

        return new SearchResultDolarQuoteDay(response.body());
    }
    
}
