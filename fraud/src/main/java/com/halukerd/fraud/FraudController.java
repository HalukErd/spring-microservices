package com.halukerd.fraud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@Slf4j
public record FraudController(FraudCheckService fraudCheckHistoryService) {

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerID) {
        log.info("new fraud check request {}", customerID);
        boolean isFradulentCustomer = fraudCheckHistoryService.isFraudulentCustomer(customerID);
        return new FraudCheckResponse(isFradulentCustomer);
    }
}
