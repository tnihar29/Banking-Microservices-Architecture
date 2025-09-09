package com.example.accounts.service.client;

import com.example.accounts.dto.CardsDto;
import com.example.accounts.dto.LoansDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("loans")
public interface LoansFeignClient {

    @GetMapping(value = "api/fetch", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<LoansDto> fetchLoanDetails(@RequestHeader("niharbank-correlation-id") String correlationId, @RequestParam String mobileNumber);
}
