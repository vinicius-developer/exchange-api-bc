package com.api.bcb.currency.exchange.dollar.quote.day.ds;

import com.api.bcb.currency.commom.api.search.SearchResult;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import java.math.BigDecimal;

public class SearchResultDolarQuoteDay extends SearchResult implements SearchResultDolarQuoteDayInterface {

    private BigDecimal purchaseQuote;

    private BigDecimal saleQuote;

    private String hourQuote;

    public SearchResultDolarQuoteDay(String from) {
        JsonObject jsonObject = new Gson().fromJson(from, JsonObject.class);

        this.setContext(jsonObject.get("@odata.context").getAsString());
        this.setProperties(jsonObject.get("value").getAsJsonArray());
    }

    private void setProperties(JsonArray array) {
        JsonObject object = array.get(0).getAsJsonObject();

        this.purchaseQuote = object.get("cotacaoCompra")
                .getAsBigDecimal();

        this.saleQuote = object.get("cotacaoVenda")
                .getAsBigDecimal();

        this.hourQuote = object.get("dataHoraCotacao")
                .getAsString();
    }

    @Override
    public BigDecimal getPurchaseQuote() {
        return this.purchaseQuote;
    }

    @Override
    public BigDecimal getSaleQuote() {
        return this.saleQuote;
    }

    @Override
    public String getHourQuote() {
        return this.hourQuote;
    }

    @Override
    public String toString() {

        return "{\"context\": " +
            this.getContext() +
            ", \n" +
            "\"value\": [ \n" +
            "\t{ \n" +
            "\t\t\"cotacaoCompra\": " +
            this.purchaseQuote.toString() +
            ", \n" +
            "\t\t\"cotacaoVenda\": " +
            this.saleQuote.toString() +
            ", \n" +
            "\t\t\"dataHoraCotacao\": " +
            this.hourQuote +
            "\n" +
            "\t} \n" +
            "]}";
    }
    
}
