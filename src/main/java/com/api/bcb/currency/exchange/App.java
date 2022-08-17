package com.api.bcb.currency.exchange;

import java.io.IOException;
import java.net.URISyntaxException;

import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrency;
import com.api.bcb.currency.exchange.factory.ExchangeTaxesFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws URISyntaxException, IOException, InterruptedException
    {
        SeachResultCurrencyInterface new ExchangeTaxesFactory().currency().get();
            
    }
}
