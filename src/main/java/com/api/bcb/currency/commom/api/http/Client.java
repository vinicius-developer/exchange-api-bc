package com.api.bcb.currency.commom.api.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.InvalidParameterException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Client {

    public HttpResponse<String> get(String route)
            throws IOException, InterruptedException {

        HttpRequest httpRequest = this.getRequester(route);

        return this.getResponseFrom(httpRequest);

    }

    private HttpResponse<String> getResponseFrom(HttpRequest request)
            throws IOException, InterruptedException {
        return HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
    }

    private HttpRequest getRequester(String route) {

        HttpRequest http = null;

        try {

            http = this.makeRequest(route);

        } catch (URISyntaxException e) {

            throw new InvalidParameterException("Path fornecido nao e valido");

        }

        return http;

    }

    private HttpRequest makeRequest(String route) throws URISyntaxException {
        return HttpRequest.newBuilder(new URI(route))
                .timeout(Duration.of(5, ChronoUnit.SECONDS))
                .GET()
                .build();
    }

}
