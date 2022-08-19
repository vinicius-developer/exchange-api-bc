package com.api.bcb.currency.exchange.dollar.quote.day.ds;

import java.math.BigDecimal;

public interface SearchResultDolarQuoteDayInterface {
    
    BigDecimal getPurchaseQuote();

    BigDecimal getSaleQuote();

    String getHourQuote();

}
