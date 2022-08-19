package com.api.bcb.currency.exchange.dollar.quote.period;

import java.io.IOException;
import java.net.URISyntaxException;

import com.api.bcb.currency.exchange.dollar.quote.day.ds.SearchResultDolarQuoteDayInterface;

public interface DollarQuotePeriodInterface {

    public SearchResultDolarQuoteDayInterface get() 
            throws URISyntaxException, IOException, InterruptedException;
    
}
