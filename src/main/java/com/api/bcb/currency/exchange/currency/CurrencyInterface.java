package com.api.bcb.currency.exchange.currency;

import java.io.IOException;
import java.net.URISyntaxException;

import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrency;

public interface CurrencyInterface {

    SearchResultCurrency get() throws URISyntaxException, IOException, InterruptedException;

    CurrencyInterface max(int numberElements);

}
