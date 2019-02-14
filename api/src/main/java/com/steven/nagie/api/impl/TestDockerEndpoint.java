package com.steven.nagie.api.impl;

import com.steven.nagie.domain.api.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class TestDockerEndpoint {

  @Autowired
  private MultiplicationService service;

  @GetMapping("/multiply")
  public BigDecimal multiplyByTen(@RequestParam("start") BigDecimal startNumber) {
    return service.multiplyByTen(startNumber);
  }
}
