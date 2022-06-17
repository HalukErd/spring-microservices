package com.halukerd.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
