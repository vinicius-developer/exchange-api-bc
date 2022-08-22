package com.api.bcb.currency.exchange.reportcard.quote.day;

import java.io.IOException;
import java.security.InvalidParameterException;

import com.api.bcb.currency.commom.api.EntityApi;
import com.api.bcb.currency.commom.api.currency.ContryCurrency;
import com.api.bcb.currency.commom.api.date.simple.ValidateSimpleDate;
import com.api.bcb.currency.exchange.reportcard.quote.day.ds.SearchDollarQuoteDayInterface;

public class ReportCardQuoteDay extends EntityApi
    implements ReportCardQuoteDayInterface  {

    private final String date;

    private final String currency;

    private Integer max = 100;

    public ReportCardQuoteDay(ContryCurrency contryCurrency, String date) {
        this.validateDate(date);
        this.date = date;

        this.currency = contryCurrency.getCurrency();
    }

    public ReportCardQuoteDay max(Integer numberOfElements) {
        this.validateNumberMaxOfResult(numberOfElements);
        this.max = numberOfElements;
        return this;
    }

    @Override
    public SearchDollarQuoteDayInterface get() 
        throws IOException, InterruptedException {
        return new RequesterToReportCardQuoteDayApi(this.getRequestParams())
            .doRequest();
    }

    @Override
    protected String getRequestParams() {
        return "?@moeda=" + 
            "'" + 
            this.currency + 
            "'" + 
            "&@dataCotacao=" + 
            "'" + 
            this.date + 
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
