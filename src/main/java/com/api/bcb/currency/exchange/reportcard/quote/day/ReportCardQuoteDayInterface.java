package com.api.bcb.currency.exchange.reportcard.quote.day;

import java.io.IOException;

import com.api.bcb.currency.exchange.reportcard.quote.day.ds.SearchDollarQuoteDayInterface;

public interface ReportCardQuoteDayInterface {
    
    public SearchDollarQuoteDayInterface get() 
            throws IOException, InterruptedException;

    ReportCardQuoteDay max(Integer numberOfElements);

}
