package com.testcontainers.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EnvironmentController {

  @GetMapping("/env")
  public Map<String, String> getEnvironmentVariables() {
    return System.getenv();
  }
}
