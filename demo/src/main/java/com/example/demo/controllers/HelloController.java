package com.example.demo.controllers;

import java.util.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping("/index")
  public List<String> index() {
    String[] messages = { "こんにちは！", "", "お元気ですか？", "" };
    return Arrays.asList(messages);
  }
}
