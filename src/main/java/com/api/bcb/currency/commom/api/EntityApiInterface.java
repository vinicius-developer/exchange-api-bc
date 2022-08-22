package com.api.bcb.currency.commom.api;

/**
 * Classe utilizada para definiciar um contrato com as classes filhas 
 * 
 * O método getRequestParam tem a intenção de retornar o path com os parãmetros
 * corretos para o endpoint. É intessante que esse método também não possa ser chamdo 
 * fora dos escopos da classe.
 * 
 */
public abstract class EntityApiInterface {

    protected abstract String getRequestParams();
    
}
