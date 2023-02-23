package com.example.demo.services;

import com.example.demo.interfaces.Flyable;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class LambdaYoyoService {

  private String url = "https://qiita.com/yoshitaro-yoyo/items/5a30915fc43a35ff10b4";

  public void run() {
    Flyable f = new Flyable() {
      @Override
      public String fly(int V, String U) {
        return U + V;
      }
    };

    Flyable g = (V, U) -> U + V;

    System.out.println(f.fly(0, "a"));
    System.out.println(g.fly(1, "b"));
  }
}
