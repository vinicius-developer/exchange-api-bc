package com.api.bcb.currency.exchange.factory;

import com.api.bcb.currency.exchange.currency.Currency;
import com.api.bcb.currency.exchange.currency.CurrencyInterface;

public class ExchangeTaxesFactory implements ExchangeTaxesInterface {

    @Override
    public CurrencyInterface currency() {
        return new Currency();
    }
}
