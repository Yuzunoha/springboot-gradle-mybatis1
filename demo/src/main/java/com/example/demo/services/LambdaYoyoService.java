package com.example.demo.services;

import com.example.demo.interfaces.SampleSum;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class LambdaYoyoService {

  private String url = "https://qiita.com/yoshitaro-yoyo/items/5a30915fc43a35ff10b4";

  public void run() {
    SampleSum ss = new SampleSum() {
      @Override
      public int sum(int x, int y) {
        return x + y;
      }
    };
    System.out.println("runですyoyo: " + ss.sum(10, 3));
  }
}
