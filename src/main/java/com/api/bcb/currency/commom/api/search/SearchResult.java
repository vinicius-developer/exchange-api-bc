package com.api.bcb.currency.commom.api.search;

public abstract class SearchResult {

    protected String context;

    protected void setContext(String context) {
        this.context = context;
    }

    public String getContext() {
        return this.context;
    }
    
}
