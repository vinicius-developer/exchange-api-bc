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
        return "[ \n" + 
            "\"simbolo\": " + 
            "\"" + 
            this.symbol + 
            "\", \n" + 
            "\"nome_formatado\": " + 
            "\"" + 
            this.formattedName + 
            "\", \n" + 
            "\"tipo\": " + 
            "\"" + 
            this.type + 
            "\", \n";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }

        CurrencyData currencyData = (CurrencyData) obj;

        if(!currencyData.symbol.equals(this.symbol)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return this.symbol.hashCode();
    }

}
