package com.api.bcb.currency.exchange.dollar.quote.day;

import java.io.IOException;
import java.security.InvalidParameterException;

import com.api.bcb.currency.commom.api.EntityApiInterface;
import com.api.bcb.currency.commom.api.date.simple.ValidateSimpleDate;
import com.api.bcb.currency.exchange.dollar.quote.day.ds.SearchResultDolarQuoteDayInterface;

public class DollarQuoteDay extends EntityApiInterface 
    implements DollarQuoteDayInterface {

    private String date;

    public DollarQuoteDay(String date) {

        this.setDate(date);

    }

    @Override
    public SearchResultDolarQuoteDayInterface get() 
            throws IOException, InterruptedException {
        return new RequesterToDollarQuoteDayApi(this.getRequestParams())
            .doRequest();
    }

    private void setDate(String date) {
        
        this.validateData(date);

        this.date = date;

    }

    @Override
    protected String getRequestParams() {
        return new StringBuilder("?@dataCotacao=")
            .append("'")
            .append(this.date)
            .append("'")
            .append("&format=json")
            .toString();
    }

    private void validateData(String date) {
        if(!ValidateSimpleDate.isValid(date)) {
            throw new InvalidParameterException("Data informada nao e valida");
        }
    }
    
}
