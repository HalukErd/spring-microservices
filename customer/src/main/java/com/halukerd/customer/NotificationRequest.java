package com.halukerd.customer;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}
