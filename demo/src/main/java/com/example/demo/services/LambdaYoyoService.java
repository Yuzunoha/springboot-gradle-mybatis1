package com.example.demo.services;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class LambdaYoyoService {

  private String url = "https://qiita.com/yoshitaro-yoyo/items/5a30915fc43a35ff10b4";

  public void run() {
    System.out.println("runですyoyo");
  }
}
