package com.api.bcb.currency.exchange.dollar.quote.period;

import java.io.IOException;


import com.api.bcb.currency.exchange.dollar.quote.period.ds.SearchResultDolarQuotePeriodInterface;

public interface DollarQuotePeriodInterface {

    SearchResultDolarQuotePeriodInterface get() 
            throws IOException, InterruptedException;
    
    DollarQuotePeriod max(Integer numberElements);

}
