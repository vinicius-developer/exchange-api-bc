package com.api.bcb.currency.exchange.dollar.quote.day;

import java.security.InvalidParameterException;

import com.api.bcb.currency.commom.api.EntityApiInterface;
import com.api.bcb.currency.commom.api.date.simple.ValidateSimpleDate;
import com.api.bcb.currency.exchange.dollar.quote.day.ds.SearchResultDolarQuoteDay;

public class DollarQuoteDay extends EntityApiInterface implements DollarQuoteDayInterface {

    private String date;

    private Integer max;

    public DollarQuoteDay(String date) {

        this.setDate(date);

    }

    @Override
    public SearchResultDolarQuoteDay get() {
        // TODO Auto-generated method stub
        return null;
    }

    private void setDate(String date) {
        
        if(!ValidateSimpleDate.isValid(date)) {
            throw new InvalidParameterException("Data informada nao e valida");
        }

        this.date = date;

    }

    @Override
    public DollarQuoteDayInterface max(int numberElements) {
        if(numberElements < 0) {
            throw new InvalidParameterException("Quantidade deve ser maior que zero");
        }

        this.max = numberElements;

        return this;
    }

    @Override
    protected String getRequestParams() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
