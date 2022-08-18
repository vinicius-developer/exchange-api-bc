package com.api.bcb.currency.commom.api.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Client {

    public HttpResponse<String> getResponseFrom(HttpRequest request)
            throws IOException, InterruptedException {
        return HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
    }

    public HttpRequest getRequester(String route) throws URISyntaxException {
        return HttpRequest.newBuilder(new URI(route))
            .timeout(Duration.of(5, ChronoUnit.SECONDS))
            .GET()
            .build();
    }
    
}
