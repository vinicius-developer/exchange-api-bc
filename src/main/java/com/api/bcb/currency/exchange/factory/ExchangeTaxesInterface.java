package com.api.bcb.currency.exchange.factory;

import com.api.bcb.currency.exchange.currency.CurrencyInterface;
import com.api.bcb.currency.exchange.dollar.quote.day.DollarQuoteDayInterface;

public interface ExchangeTaxesInterface {

    CurrencyInterface currency();

    DollarQuoteDayInterface dollarQuoteDay(String date);

}
