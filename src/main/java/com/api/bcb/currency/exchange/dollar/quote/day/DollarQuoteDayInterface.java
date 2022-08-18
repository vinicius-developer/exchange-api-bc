package com.api.bcb.currency.exchange.dollar.quote.day;

import com.api.bcb.currency.exchange.dollar.quote.day.ds.SearchResultDolarQuoteDay;

public interface DollarQuoteDayInterface {

    SearchResultDolarQuoteDay get();
    
    DollarQuoteDayInterface max(int numberElements);

}
