package com.api.bcb.currency.exchange.dollar.quote.period.ds;

import java.util.ArrayList;
import java.util.List;

import com.api.bcb.currency.commom.api.search.SearchResult;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class SearchResultDolarQuotePeriod extends SearchResult 
    implements SearchResultDolarQuotePeriodInterface {

    private final List<ResultDolarQuote> listResultDolarQuotes = new ArrayList<>();

    public SearchResultDolarQuotePeriod(String from) {
        JsonObject jsonObject = new Gson().fromJson(from, JsonObject.class);

        this.setContext(jsonObject.get("@odata.context").getAsString());

        JsonArray jsonArray = jsonObject.get("value").getAsJsonArray();

        this.setListResultDolarQuotes(jsonArray);

    }

    public void setListResultDolarQuotes(JsonArray array) {

        for (JsonElement element : array) {

            JsonObject object = element.getAsJsonObject();

            ResultDolarQuote resultDolarQuote = new ResultDolarQuote(
                object.get("cotacaoCompra").getAsBigDecimal(), 
                object.get("cotacaoVenda").getAsBigDecimal(), 
                object.get("dataHoraCotacao").getAsString()
            );

            this.listResultDolarQuotes.add(resultDolarQuote);
            
        }

    }

    @Override
    public List<ResultDolarQuote> getListResultDolarQuote() {
        return this.listResultDolarQuotes;
    }

    @Override
    public String toString() {
        return new StringBuilder("{\"context\": ")
            .append("\"")
            .append(this.getContext())
            .append("\", \n")
            .append("\"value\": {\n")
            .append(this.listResultDolarQuotes)
            .append("}\n")
            .toString();
    }
    
}
