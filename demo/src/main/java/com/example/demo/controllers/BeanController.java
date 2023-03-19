package com.example.demo.controllers;

import com.example.demo.services.BeanService1;
import com.example.demo.services.BeanService2;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean")
@RequiredArgsConstructor
public class BeanController {

  private final BeanService1 beanService1;
  private final BeanService2 beanService2;

  @RequestMapping("/")
  public String index() {
    List<String> l = new ArrayList<>();
    l.add("beanです。");
    l.add("beanService1.getMessageBean().hashCode(): " + beanService1.getMessageBean().hashCode());
    l.add("beanService2.getMessageBean().hashCode(): " + beanService2.getMessageBean().hashCode());
    l.add("出力方法を工夫してみました。");

    beanService1.getMessageBean().setMessage("1にメッセージをセットしました");

    l.add("beanService1.getMessageBean().hashCode(): " + beanService1.getMessageBean().hashCode());
    l.add("beanService2.getMessageBean().hashCode(): " + beanService2.getMessageBean().hashCode());
    l.add("beanService1.getMessageBean().getMessage(): " + beanService1.getMessageBean().getMessage());
    l.add("beanService2.getMessageBean().getMessage(): " + beanService2.getMessageBean().getMessage());
    return fmt(l);
  }

  private String fmt(List<String> l) {
    String s = "";
    for (String t : l) {
      s += t + "\n";
    }
    return s;
  }
}
