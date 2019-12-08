package de.andielst.equifax.test;

import de.andielst.equifax.model.MessageStore;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GetGreetingIT {

    @RepeatedTest(500)
    void testGreetings() throws IOException, InterruptedException {
        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(URI.create("http://localhost:8080/equifax/hello.action"))
                        .build();

        HttpResponse<String> response =
                HttpClient.newHttpClient().send(
                request, HttpResponse.BodyHandlers.ofString());

        int httpsStatusCode=response.statusCode();
        String body = response.body();

        assertEquals(httpsStatusCode,200);
        assertTrue(body.contains(MessageStore.message));

    }
}
