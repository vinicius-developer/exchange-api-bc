package com.api.bcb.currency.exchange.dollar.quote.period;

import java.io.IOException;
import java.security.InvalidParameterException;

import com.api.bcb.currency.commom.api.EntityApi;
import com.api.bcb.currency.commom.api.date.simple.ValidateSimpleDate;
import com.api.bcb.currency.exchange.dollar.quote.period.ds.SearchResultDolarQuotePeriodInterface;

/**
 * 1 - método public
 * 1 - modificador de fluxo
 * 2 - centena de linha na classe
 * 2 - meia centena de linha na método
 * 
 * Classe criada para acessar as cotações do dolar por periodo
 * no Endpoint CotacaoDolarPeriodo(dataInicial=@dataInicial,
 * dataFinalCotacao=@dataFinalCotacao) a data padrão empregada 
 * pela API é MM-dd-yyyy
 * 
 * Os parâmetros obrigatórios para acessar esse recurso é a 
 * data inicia e a data final do período de cotação
 */
public class DollarQuotePeriod extends EntityApi 
    implements DollarQuotePeriodInterface {

    private final String start;

    private final String end;

    private Integer max = 100;

    public DollarQuotePeriod(String start, String end) {
        this.validateData(start);
        this.start = start;
        
        this.validateData(end);
        this.end = end;
    }

    //1
    @Override
    public SearchResultDolarQuotePeriodInterface get() 
        throws IOException, InterruptedException {
        return new RequesterToDollarQuotePeriodApi(this.getRequestParams())
            .doRequest();
    }
    
    public DollarQuotePeriod max(Integer numberElements) {
        this.max = numberElements;
        return this;
    }
    
    @Override
    protected String getRequestParams() {
        return "?@dataInicial=" + 
            "'" + 
            this.start + 
            "'" +
            "&@dataFinalCotacao=" + 
            "'" + 
            this.end + 
            "'" +
            "&$top=" +
            this.max +
            "&$format=json";
    }

    private void validateData(String date) {
        if(!ValidateSimpleDate.isValid(date)) {
            throw new InvalidParameterException("Data informada nao e valida");
        }
    }
    
}
