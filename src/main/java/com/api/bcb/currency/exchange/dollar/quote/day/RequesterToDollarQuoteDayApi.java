package com.api.bcb.currency.exchange.dollar.quote.day;

import com.api.bcb.currency.commom.api.BcCentralApiV1;

class RequesterToDollarQuoteDayApi extends BcCentralApiV1 {

    public RequesterToDollarQuoteDayApi(String params) {
        super("/CotacaoDolarDia(dataCotacao=@dataCotacao)", params);
    }
    
}
