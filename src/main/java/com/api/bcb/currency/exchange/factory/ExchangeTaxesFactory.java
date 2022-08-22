package com.api.bcb.currency.exchange.factory;

import com.api.bcb.currency.commom.api.currency.ContryCurrency;
import com.api.bcb.currency.exchange.currency.Currency;
import com.api.bcb.currency.exchange.currency.CurrencyInterface;
import com.api.bcb.currency.exchange.dollar.quote.day.DollarQuoteDay;
import com.api.bcb.currency.exchange.dollar.quote.period.DollarQuotePeriod;
import com.api.bcb.currency.exchange.dollar.quote.day.DollarQuoteDayInterface;
import com.api.bcb.currency.exchange.dollar.quote.period.DollarQuotePeriodInterface;
import com.api.bcb.currency.exchange.reportcard.quote.day.ReportCardQuoteDay;
import com.api.bcb.currency.exchange.reportcard.quote.day.ReportCardQuoteDayInterface;
import com.api.bcb.currency.exchange.reportcard.quote.period.ReportCardQuotePeriod;
import com.api.bcb.currency.exchange.reportcard.quote.period.ReportCardQuotePeriodInterface;

/**
 * Fabrica responsável por encapsular a lógica para a criação 
 * dos objetos que entram em contado com a API do Bacen
 */
public class ExchangeTaxesFactory implements ExchangeTaxesInterface {

    @Override
    public CurrencyInterface currency() {
        return new Currency();
    }

    @Override
    public DollarQuoteDayInterface dollarQuoteDay(String date) {
        return new DollarQuoteDay(date);
    }

    @Override
    public DollarQuotePeriodInterface dollarQuotePeriod(String start, String end) {
        return new DollarQuotePeriod(start, end);
    }

    @Override
    public ReportCardQuoteDayInterface reportCardQuoteDay(
        ContryCurrency currency, String date) {
        return new ReportCardQuoteDay(currency, date);
    }

    @Override
    public ReportCardQuotePeriodInterface reportCardQuotePeriod(
        ContryCurrency currency, String start, String end) {
        return new ReportCardQuotePeriod(currency, start, end);
    }

    
}
