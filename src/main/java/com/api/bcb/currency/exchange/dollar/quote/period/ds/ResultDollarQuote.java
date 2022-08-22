package com.api.bcb.currency.exchange.dollar.quote.period.ds;

import java.math.BigDecimal;

public class ResultDollarQuote {

    private BigDecimal purchaseQuote;

    private BigDecimal saleQuote;

    private String hourQuote;

    public ResultDollarQuote(
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
        return "{\n" +
            "\"purchaseQuote\": " + 
            this.purchaseQuote + 
            ", \n" + 
            "\"sellQuote\": " + 
            this.saleQuote + 
            ", \n" + 
            "\"hourQuote\": " + 
            this.hourQuote + 
            "\n}";
            
    }
        
}
