package com.steven.nagie.api;

import com.steven.nagie.api.impl.TestDockerEndpoint;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;

@ContextConfiguration(classes = ITConfig.class)
@WebAppConfiguration
public class MultiModuleTestIT extends AbstractTestNGSpringContextTests {
  
  @Autowired
  private TestDockerEndpoint testDockerEndpoint;
  
  @Test
  public void testMultiplicationEndpoint() {
    BigDecimal response = testDockerEndpoint.multiplyByTen(BigDecimal.TEN);
    assertEquals(response, new BigDecimal("100"));
  }
}
