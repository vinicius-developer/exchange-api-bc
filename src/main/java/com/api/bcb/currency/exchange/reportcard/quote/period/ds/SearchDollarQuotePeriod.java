package com.api.bcb.currency.exchange.reportcard.quote.period.ds;

import java.util.ArrayList;
import java.util.List;

import com.api.bcb.currency.commom.api.search.SearchResult;
import com.api.bcb.currency.exchange.reportcard.quote.DailyReportCard;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class SearchDollarQuotePeriod extends SearchResult
        implements SearchDollarQuotePeriodInterface {

    private List<DailyReportCard> listDailyReportCard = new ArrayList<>();

    public SearchDollarQuotePeriod(String from) {
        JsonObject jsonObject = new Gson().fromJson(from, JsonObject.class);

        this.setContext(jsonObject.get("@odata.context").getAsString());

        JsonArray jsonArray = jsonObject.get("value").getAsJsonArray();

        this.setListDailyReportCard(jsonArray);
    }

    private void setListDailyReportCard(JsonArray jsonArray) {
        for (JsonElement element : jsonArray) {

            JsonObject object = element.getAsJsonObject();

            DailyReportCard dailyReportCard = new DailyReportCard(
                object.get("paridadeCompra").getAsInt(),
                object.get("paridadeVenda").getAsInt(),
                object.get("cotacaoCompra").getAsBigDecimal(),
                object.get("cotacaoVenda").getAsBigDecimal(),
                object.get("dataHoraCotacao").getAsString(),
                object.get("tipoBoletim").getAsString()
            );
        
            this.listDailyReportCard.add(dailyReportCard);
        }
    }
    

    @Override
    public List<DailyReportCard> getListDailyReportCard() {
        return this.listDailyReportCard;
    }

    @Override
    public String toString() {
        return  "{\"context\": " + 
            "\"" + 
            this.getContext() + 
            "\", \n" + 
            "\"value\": {\n" +
            this.listDailyReportCard + 
            "}\n";
    }

}
