package com.example.demo.controllers;

import com.example.demo.services.CalcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calc")
public class CalcController {

  private final CalcService calcService;

  @RequestMapping("/div/{up}/{down}")
  public String div(@PathVariable double up, @PathVariable double down) {
    if (0 == down) {
      return "{ error: '0で割ろうとしています。' }";
    }
    double a = calcService.createDiv().div(up, down);
    return String.format("{ result: %f }", a);
  }
}
