package com.api.bcb.currency.exchange.reportcard.quote.period;

import java.io.IOException;

import com.api.bcb.currency.exchange.reportcard.quote.period.ds.SearchDollarQuotePeriodInterface;

public interface ReportCardQuotePeriodInterface {
    
    SearchDollarQuotePeriodInterface get() 
        throws IOException, InterruptedException;

    ReportCardQuotePeriod max(Integer numberOfElements);

}
