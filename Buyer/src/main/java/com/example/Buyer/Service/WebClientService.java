package com.example.Buyer.Service;

import com.example.Buyer.Model.PaymentResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {

    private final WebClient webClient;

    public WebClientService() {
         this.webClient = WebClient.builder()
                .baseUrl("http://localhost:8081/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }


    public Mono<PaymentResponse> findById(String id)
    {
        return webClient.get()
                .uri("/profile/getpayment/" + id)
                .retrieve()
                .bodyToMono(PaymentResponse.class);
    }

}
