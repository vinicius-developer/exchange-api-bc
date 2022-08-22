package com.api.bcb.currency.exchange.reportcard.quote.day;

import java.io.IOException;
import java.net.http.HttpResponse;

import com.api.bcb.currency.commom.api.http.Client;
import com.api.bcb.currency.commom.api.BcCentralApiV1;
import com.api.bcb.currency.exchange.reportcard.quote.day.ds.SearchDollarQuoteDay;
import com.api.bcb.currency.exchange.reportcard.quote.day.ds.SearchDollarQuoteDayInterface;

public class RequesterToReportCardQuoteDayApi extends BcCentralApiV1 {

    private final Client client = new Client();

    public RequesterToReportCardQuoteDayApi(String params) {
        super(RequesterToReportCardQuoteDayApi.getPath(), params);
    }

    public SearchDollarQuoteDayInterface doRequest() 
            throws IOException, InterruptedException {
        HttpResponse<String> response = this.client.get(this.route);

        return new SearchDollarQuoteDay(response.body());
    }

    private static String getPath() {
        return "/CotacaoMoedaDia(moeda=@moeda,dataCotacao=@dataCotacao)";
    }
    
}
