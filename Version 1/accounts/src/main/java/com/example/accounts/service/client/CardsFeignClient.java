package com.example.accounts.service.client;

import com.example.accounts.dto.CardsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cards")
public interface CardsFeignClient {

    @GetMapping(value = "api/fetch", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CardsDto> fetchCardDetails(@RequestHeader("niharbank-correlation-id") String correlationId, @RequestParam String mobileNumber);
}
