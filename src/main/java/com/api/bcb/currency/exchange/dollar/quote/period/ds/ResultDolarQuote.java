package com.api.bcb.currency.exchange.dollar.quote.period.ds;

import java.math.BigDecimal;

public class ResultDolarQuote {

    private BigDecimal purchaseQuote;

    private BigDecimal saleQuote;

    private String hourQuote;

    public ResultDolarQuote(
        BigDecimal purchaseQuote, 
        BigDecimal saleQuote, 
        String hourQuote ) {
        this.purchaseQuote = purchaseQuote;

        this.saleQuote = saleQuote;

        this.hourQuote = hourQuote;

    }

    public BigDecimal getPurchaseQuote() {
        return this.purchaseQuote;
    }

    public BigDecimal getSaleQuote() {
        return this.saleQuote;
    }

    public String hourQuote() {
        return this.hourQuote;
    }

    @Override
    public String toString() {
        return new StringBuilder("{\n")
            .append("\"purchaseQuote\": ")
            .append(this.purchaseQuote)
            .append(", \n")
            .append("\"sellQuote\": ")
            .append(this.saleQuote)
            .append(", \n")
            .append("\"hourQuote\": ")
            .append(this.hourQuote)
            .append("\n}")
            .toString();
            
    }
        
}
