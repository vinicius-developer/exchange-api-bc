package com.api.bcb.currency;

import java.io.IOException;
import java.net.URISyntaxException;

import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrencyInterface;
import com.api.bcb.currency.exchange.factory.ExchangeTaxesFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws URISyntaxException, IOException, InterruptedException
    {
        SearchResultCurrencyInterface result = new ExchangeTaxesFactory()
            .currency()
            .get();

        System.out.println(result);
            
    }
}
