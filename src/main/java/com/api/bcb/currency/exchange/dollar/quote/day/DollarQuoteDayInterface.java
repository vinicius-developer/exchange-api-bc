package com.api.bcb.currency.exchange.dollar.quote.day;

import java.io.IOException;

import com.api.bcb.currency.exchange.dollar.quote.day.ds.SearchResultDolarQuoteDayInterface;

public interface DollarQuoteDayInterface {

    SearchResultDolarQuoteDayInterface get() 
            throws IOException, InterruptedException;
    
}
