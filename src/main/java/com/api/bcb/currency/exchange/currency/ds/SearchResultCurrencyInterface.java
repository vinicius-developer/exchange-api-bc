package com.api.bcb.currency.exchange.currency.ds;

import java.util.List;

public interface SearchResultCurrencyInterface {
    
    String getContext();

    List<CurrencyData> getListCurrencyData();

}
