package com.api.bcb.currency.exchange.currency;

import java.io.IOException;

import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrencyInterface;


public interface CurrencyInterface {

    SearchResultCurrencyInterface get() 
            throws IOException, InterruptedException;

    CurrencyInterface max(Integer numberElements);

}
