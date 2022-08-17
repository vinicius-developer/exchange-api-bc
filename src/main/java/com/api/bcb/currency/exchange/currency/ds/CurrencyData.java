package com.api.bcb.currency.exchange.currency.ds;

public class CurrencyData {

    private String symbol;

    private String formattedName;

    private String type;

    public CurrencyData(String symbol, String formattedName, String type) {
        this.symbol = symbol;
        this.formattedName = formattedName;
        this.type = type;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getFormattedName() {
        return this.formattedName;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "{" + this.symbol + ", " 
                + this.formattedName +  ", " 
                + this.type + "}";
    }

}
