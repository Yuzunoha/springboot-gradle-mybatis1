package com.example.demo.controllers;

import com.example.demo.services.LambdaJamboService;
import com.example.demo.services.LambdaYoyoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lambda")
@RequiredArgsConstructor
public class LambdaController {

  private final LambdaJamboService lambdaJamboService;
  private final LambdaYoyoService lambdaYoyoService;

  @RequestMapping("/jambo")
  public String jambo() {
    lambdaJamboService.run();
    return "LambdaJamboController jambo() 実行しました";
  }

  @RequestMapping("/yoyo")
  public String yoyo() {
    lambdaYoyoService.run();
    return "LambdaJamboController yoyo() 実行しました";
  }
}
