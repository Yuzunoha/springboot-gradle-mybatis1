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

  @GetMapping("/test")
  public String test() {
    Flyable f = Outer.create("太郎");
    f.fly();
    return "";
  }
}

interface Flyable {
  void fly();
}

class Outer {

  private String name;

  public Outer(String name) {
    this.name = name;
  }

  public static Flyable create(String name) {
    return (new Outer(name)).new Inner();
  }

  private class Inner implements Flyable {

    @Override
    public void fly() {
      System.out.println(name + "が飛びます！！！");
    }
  }
}
