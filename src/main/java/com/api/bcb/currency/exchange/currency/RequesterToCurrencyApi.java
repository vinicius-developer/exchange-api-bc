package com.api.bcb.currency.exchange.currency;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import com.api.bcb.currency.commom.api.BcCentralApi;
import com.api.bcb.currency.exchange.currency.ds.SearchResultCurrency;

class RequesterToCurrencyApi extends BcCentralApi {

    public RequesterToCurrencyApi(String params) {
        super(params);
    }

    public SearchResultCurrency doRequest() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = this.getRequester();

        HttpResponse<String> response = this.getResponseFrom(httpRequest);

        return new SearchResultCurrency(response.body());
    }

    private HttpResponse<String> getResponseFrom(HttpRequest request)
            throws IOException, InterruptedException {
        return HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
    }

    private HttpRequest getRequester() throws URISyntaxException {
        return HttpRequest.newBuilder(new URI(this.route))
            .timeout(Duration.of(5, ChronoUnit.SECONDS))
            .GET()
            .build();
    }



}