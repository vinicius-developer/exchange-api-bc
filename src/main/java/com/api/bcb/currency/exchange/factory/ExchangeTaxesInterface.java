package com.api.bcb.currency.exchange.factory;

import com.api.bcb.currency.commom.api.currency.ContryCurrency;
import com.api.bcb.currency.exchange.currency.CurrencyInterface;
import com.api.bcb.currency.exchange.dollar.quote.day.DollarQuoteDayInterface;
import com.api.bcb.currency.exchange.dollar.quote.period.DollarQuotePeriodInterface;
import com.api.bcb.currency.exchange.reportcard.quote.day.ReportCardQuoteDayInterface;
import com.api.bcb.currency.exchange.reportcard.quote.period.ReportCardQuotePeriodInterface;

public interface ExchangeTaxesInterface {

    CurrencyInterface currency();

    DollarQuoteDayInterface dollarQuoteDay(String date);

    DollarQuotePeriodInterface dollarQuotePeriod(String start, String end);

    ReportCardQuoteDayInterface reportCardQuoteDay(ContryCurrency currency, String date);

    ReportCardQuotePeriodInterface reportCardQuotePeriod(ContryCurrency currency, String start, String end);

}
