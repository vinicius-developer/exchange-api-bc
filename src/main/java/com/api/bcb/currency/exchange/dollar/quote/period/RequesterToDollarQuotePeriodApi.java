package com.api.bcb.currency.exchange.dollar.quote.period;

import java.io.IOException;
import java.net.http.HttpResponse;

import com.api.bcb.currency.commom.api.BcCentralApiV1;
import com.api.bcb.currency.commom.api.http.Client;
import com.api.bcb.currency.exchange.dollar.quote.period.ds.SearchResultDolarQuotePeriod;
import com.api.bcb.currency.exchange.dollar.quote.period.ds.SearchResultDolarQuotePeriodInterface;

public class RequesterToDollarQuotePeriodApi extends BcCentralApiV1 {

    private final Client client = new Client();

    public RequesterToDollarQuotePeriodApi(String params) {
        super(RequesterToDollarQuotePeriodApi.getPath(), params);
    }

    public SearchResultDolarQuotePeriodInterface doRequest() 
            throws IOException, InterruptedException {

        HttpResponse<String> response = this.client.get(this.route);

        return new SearchResultDolarQuotePeriod(response.body());
    }

    private static String getPath() {
        return "/CotacaoDolarPeriodo(dataInicial=@dataInicial," +
            "dataFinalCotacao=@dataFinalCotacao)";
    }
    
}
