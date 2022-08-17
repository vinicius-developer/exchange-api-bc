package com.api.bcb.currency.exchange.currency;

import java.io.IOException;
import java.net.URISyntaxException;

import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrencyInterface;


public interface CurrencyInterface {

    SearchResultCurrencyInterface get() throws URISyntaxException, IOException, InterruptedException;

    CurrencyInterface max(int numberElements);

}
