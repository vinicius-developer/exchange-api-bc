package com.api.bcb.currency.exchange.factory;

import com.api.bcb.currency.exchange.currency.Currency;
import com.api.bcb.currency.exchange.currency.CurrencyInterface;
import com.api.bcb.currency.exchange.dollar.quote.day.DollarQuoteDay;
import com.api.bcb.currency.exchange.dollar.quote.day.DollarQuoteDayInterface;

public class ExchangeTaxesFactory implements ExchangeTaxesInterface {

    @Override
    public CurrencyInterface currency() {
        return new Currency();
    }

    public DollarQuoteDayInterface dollarQuoteDay(String date) {
        return new DollarQuoteDay(date);
    }
    
}
