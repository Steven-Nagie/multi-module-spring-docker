package com.steven.nagie.domain.impl;

import com.steven.nagie.domain.api.MultiplicationService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class MultiplicationServiceImpl implements MultiplicationService {
  @Override
  public BigDecimal multiplyByTen(BigDecimal startNumber) {
    return startNumber.multiply(BigDecimal.TEN);
  }
}
