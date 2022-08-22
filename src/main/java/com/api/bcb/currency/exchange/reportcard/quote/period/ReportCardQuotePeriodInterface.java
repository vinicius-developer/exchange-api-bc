package com.api.bcb.currency.exchange.reportcard.quote.period;

import java.io.IOException;

import com.api.bcb.currency.exchange.reportcard.quote.period.ds.SearchDollarQuotePeriodInterface;

public interface ReportCardQuotePeriodInterface {
    
    public SearchDollarQuotePeriodInterface get() 
            throws IOException, InterruptedException;

}
