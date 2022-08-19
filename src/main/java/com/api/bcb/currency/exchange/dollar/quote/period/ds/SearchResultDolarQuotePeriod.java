package com.api.bcb.currency.exchange.dollar.quote.period.ds;

import java.util.ArrayList;
import java.util.List;

import com.api.bcb.currency.commom.api.search.SearchResult;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class SearchResultDolarQuotePeriod extends SearchResult 
    implements SearchResultDolarQuotePeriodInterface {

    private final List<ResultDolarQuote> listResultDolarQuotes = new ArrayList<>();

    public SearchResultDolarQuotePeriod(String from) {
        JsonObject jsonObject = new Gson().fromJson(from, JsonObject.class);

        this.setContext(jsonObject.get("@odata.context").getAsString());

    }

    @Override
    public List<ResultDolarQuote> getListResultDolarQuote() {
        return this.listResultDolarQuotes;
    }
    
}
