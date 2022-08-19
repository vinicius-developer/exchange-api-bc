package com.api.bcb.currency;

import java.io.IOException;

import com.api.bcb.currency.exchange.dollar.quote.period.ds.SearchResultDolarQuotePeriodInterface;
import com.api.bcb.currency.exchange.factory.ExchangeTaxesFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
        SearchResultDolarQuotePeriodInterface result = new ExchangeTaxesFactory()
            .dollarQuotePeriod("08-08-2022", "08-15-2022")
            .get();

        System.out.println(result);
            
    }
}
