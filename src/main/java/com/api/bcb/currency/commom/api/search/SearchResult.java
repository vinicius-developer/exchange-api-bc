package com.api.bcb.currency.commom.api.search;

/**
 * Classe utilizada para oferecer métodos e atributos padrãoes
 * para as estruturas de dados que são os resultados dos requests
 * 
 * Todo request possui o campo context então essa classe oferece o método
 * para armazenar esse valor
 */
public abstract class SearchResult {

    protected String context;

    protected void setContext(String context) {
        this.context = context;
    }

    public String getContext() {
        return this.context;
    }
    
}
