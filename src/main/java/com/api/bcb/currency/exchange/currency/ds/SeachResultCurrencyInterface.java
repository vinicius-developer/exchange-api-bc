package com.api.bcb.currency.exchange.currency.ds;

import java.util.List;

public interface SeachResultCurrencyInterface {
    
    String getContext();

    List<CurrencyData> getListCurrencyData();

}
