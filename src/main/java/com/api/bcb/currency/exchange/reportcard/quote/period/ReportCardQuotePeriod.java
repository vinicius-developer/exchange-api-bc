package com.api.bcb.currency.exchange.reportcard.quote.period;

import java.io.IOException;
import java.security.InvalidParameterException;

import com.api.bcb.currency.commom.api.EntityApi;
import com.api.bcb.currency.commom.api.currency.ContryCurrency;
import com.api.bcb.currency.commom.api.date.simple.ValidateSimpleDate;
import com.api.bcb.currency.exchange.reportcard.quote.period.ds.SearchDollarQuotePeriodInterface;

public class ReportCardQuotePeriod extends EntityApi
    implements ReportCardQuotePeriodInterface {

    private final String currency;    

    private final String start;

    private final String end;

    private Integer max = 100;

    public ReportCardQuotePeriod(ContryCurrency currency, String start, String end) {
        this.currency = currency.getCurrency();

        this.validateDate(start);
        this.start = start;


        this.validateDate(end);
        this.end = end;
    }

    @Override
    public SearchDollarQuotePeriodInterface get() throws IOException, InterruptedException {
        return new RequesterToReportCardQuotePeriodApi(this.getRequestParams())
            .doRequest();
    }

    public ReportCardQuotePeriod max(Integer numberOfElements) {
        this.validateNumberMaxOfResult(numberOfElements);
        this.max = numberOfElements;
        return this;        
    }

    @Override
    protected String getRequestParams() {
        return "?@moeda=" +
            "'" + 
            this.currency +
            "'" + 
            "&@dataInicial=" + 
            "'" + 
            this.start +
            "'" + 
            "&@dataFinalCotacao="+
            "'" +
            this.end + 
            "'" +
            "&$top=" + 
            this.max + 
            "&$format=json";
    }

    private void validateDate(String date) {
        if(!ValidateSimpleDate.isValid(date)) {
            throw new InvalidParameterException("Data informada nao e valida");
        }
    }

    private void validateNumberMaxOfResult(Integer numberElements) {
        if (numberElements < 0) {
            throw new InvalidParameterException("Quantidade deve ser maior que zero");
        }
    }
    
}
