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
        return new StringBuilder("[ \n")
            .append("\"simbolo\": ")
            .append("\"")
            .append(this.symbol)
            .append("\", \n")
            .append("\"nome_formatado\": ")
            .append("\"")
            .append(this.formattedName)
            .append("\", \n")
            .append("\"tipo\": ")
            .append("\"")
            .append(this.type)
            .append("\", \n")
            .toString();
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
