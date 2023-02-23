package com.example.demo.controllers;

import com.example.demo.services.LambdaJamboService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lambda-jambo")
@RequiredArgsConstructor
public class LambdaJamboController {

  private final LambdaJamboService service;

  @RequestMapping("/run")
  public String run() {
    service.run();
    return "LambdaJamboController run() 実行しました";
  }
}
