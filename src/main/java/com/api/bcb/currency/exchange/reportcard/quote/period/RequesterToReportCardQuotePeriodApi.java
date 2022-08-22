package com.api.bcb.currency.exchange.reportcard.quote.period;

import java.io.IOException;
import java.net.http.HttpResponse;

import com.api.bcb.currency.commom.api.BcCentralApiV1;
import com.api.bcb.currency.commom.api.http.Client;
import com.api.bcb.currency.exchange.reportcard.quote.period.ds.SearchDollarQuotePeriod;
import com.api.bcb.currency.exchange.reportcard.quote.period.ds.SearchDollarQuotePeriodInterface;

public class RequesterToReportCardQuotePeriodApi extends BcCentralApiV1 {

    private final Client client = new Client();

    public RequesterToReportCardQuotePeriodApi(String params) {
        super(RequesterToReportCardQuotePeriodApi.getPath(), params);
    }

    public SearchDollarQuotePeriodInterface doRequest() 
            throws IOException, InterruptedException {
        HttpResponse<String> response = this.client.get(this.route);

        return new SearchDollarQuotePeriod(response.body());
    }

    private static String getPath() {
        return "/CotacaoMoedaPeriodo(moeda=@moeda,dataInicial=@dataInicial" + 
            ",dataFinalCotacao=@dataFinalCotacao)";
    }
    
}
