package com.api.bcb.currency.exchange.dollar.quote.period;

import java.io.IOException;
import java.security.InvalidParameterException;

import com.api.bcb.currency.commom.api.EntityApiInterface;
import com.api.bcb.currency.commom.api.date.simple.ValidateSimpleDate;
import com.api.bcb.currency.exchange.dollar.quote.period.ds.SearchResultDolarQuotePeriodInterface;

public class DollarQuotePeriod extends EntityApiInterface implements DollarQuotePeriodInterface {

    private String start;

    private String end;

    public DollarQuotePeriod(String start, String end) {
        this.setStart(start);
        this.setEnd(end);
    }

    private void setStart(String date) {
        this.validateData(date);

        this.start = date;
    }

    private void setEnd(String date) {
        this.validateData(date);

        this.end = date;
    }

    @Override
    public SearchResultDolarQuotePeriodInterface get() 
        throws IOException, InterruptedException {
        return new RequesterToDollarQuotePeriodApi(this.getRequestParams())
            .doRequest();
    }

    @Override
    protected String getRequestParams() {
        return new StringBuilder("?@dataInicial=")
            .append("'")
            .append(this.start.toString())
            .append("'")
            .append("&@dataFinalCotacao=")
            .append("'")
            .append(this.end.toString())
            .append("'")
            .append("&$format=json")
            .toString();
    }

    private void validateData(String date) {
        if(!ValidateSimpleDate.isValid(date)) {
            throw new InvalidParameterException("Data informada nao e valida");
        }
    }
    
}
