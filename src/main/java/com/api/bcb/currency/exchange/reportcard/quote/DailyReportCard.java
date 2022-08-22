package com.api.bcb.currency.exchange.reportcard.quote;

import java.math.BigDecimal;

public class DailyReportCard {

    private BigDecimal purchaseQuote;
    
    private Integer purchaseParity;
    
    private String typeReportCard;
    
    private BigDecimal sellQuote;
    
    private Integer sellParity;
    
    private String timestamp;

    public DailyReportCard(
        Integer purchaseParity,
        Integer sellParity,
        BigDecimal purchaseQuote,
        BigDecimal sellQuote,
        String timestamp,
        String typeReportCard
    ) {
        this.purchaseParity = purchaseParity;
        this.sellParity = sellParity;
        this.purchaseQuote = purchaseQuote;
        this.sellQuote = sellQuote;
        this.timestamp = timestamp;
        this.typeReportCard = typeReportCard;
    }

    public Integer getPurchaseParity() {
        return this.purchaseParity;
    }

    public Integer getSellParity() {
        return this.sellParity;
    }

    public BigDecimal getPurchaseQuote() {
        return this.purchaseQuote;
    }

    public BigDecimal getSellQuote() {
        return this.sellQuote;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getTypeReportCar() {
        return this.typeReportCard;
    }

    @Override
    public String toString() {
        return "{\n" +
            "\"paridadeCompra\": " + 
            this.purchaseParity + 
            ", \n" + 
            "\"paridadeVenda\": " + 
            this.sellParity + 
            ", \n" + 
            "\"cotacaoCompra\": " + 
            this.purchaseQuote + 
            ", \n" + 
            "\"cotacaoVenda\": " + 
            this.sellQuote +
            ", \n" + 
            "\"dataHoraCotacao\": " + 
            this.timestamp +
            ", \n" + 
            "\"tipoBoletim\": " + 
            this.typeReportCard +
            "\n}";
    }
    
}
