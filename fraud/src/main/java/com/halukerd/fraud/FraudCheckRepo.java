package com.halukerd.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckRepo extends JpaRepository<FraudCheckHistory, Integer> {

}
