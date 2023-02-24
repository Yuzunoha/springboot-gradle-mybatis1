package com.example.demo.services;

import com.example.demo.interfaces.DivInterface;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

  public DivInterface createDiv() {
    return (a, b) -> a / b;
  }
}
