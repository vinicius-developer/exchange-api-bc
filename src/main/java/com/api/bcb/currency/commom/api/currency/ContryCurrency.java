package com.api.bcb.currency.commom.api.currency;

public enum ContryCurrency {

    DOLAR_AUSTRALIANO("AUD"),
    DOLAR_CANADENSE("CAD"),
    FRANCO_SUICO("CHF"),
    COROA_DINARMAQUESA("DKK"),
    EURO("EUR"),
    LIBRA_ESTERLINA("GBP"),
    IENE("JPY"),
    COROA_NORUEGUESA("NOK"),
    COROA_SUECA("SEK"),
    DOLAR_ESTADOS_UNIDOS("USD");

    private final String currency;

    ContryCurrency(String value) {
        this.currency = value;
    }

    public String getCurrency() {
        return this.currency;
    }
}

