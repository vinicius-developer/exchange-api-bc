package com.api.bcb.currency.exchange.currency.ds;

import java.util.ArrayList;
import java.util.List;

import com.api.bcb.currency.commom.api.search.SearchResult;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class SearchResultCurrency extends SearchResult implements SearchResultCurrencyInterface {

    private final List<CurrencyData> listCurrencyData = new ArrayList<>(); 

    public SearchResultCurrency(String from) {
        JsonObject jsonObject = new Gson().fromJson(from, JsonObject.class);

        this.setContext(jsonObject.get("@odata.context").getAsString());
        this.setListCurrencyData(jsonObject.getAsJsonArray("value"));
    }

    private void setListCurrencyData(JsonArray values) {

        for (JsonElement value : values) {

            JsonObject object =  value.getAsJsonObject();

            CurrencyData currencyData = new CurrencyData(
                object.get("simbolo").getAsString(), 
                object.get("nomeFormatado").getAsString(), 
                object.get("tipoMoeda").getAsString()
            );

            this.listCurrencyData.add(currencyData);
            
        }

    }

    public List<CurrencyData> getListCurrencyData() {
        return this.listCurrencyData;
    }

    @Override
    public String toString() {
        return "{\"context\": \n" +
            "\"" +
            this.context +
            "\", \n" +
            "\"listCurrencyData\": " +
            this.listCurrencyData +
            "\n }";
    }

}
