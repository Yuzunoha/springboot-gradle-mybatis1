package com.example.demo.services;

import com.example.demo.interfaces.DoubleStr;
import com.example.demo.interfaces.SampleSum;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class LambdaJamboService {

  private String url = "https://qiita.com/haraitai00/items/2f53867f0691e8ed9364";

  private class X implements SampleSum {

    @Override
    public int sum(int x, int y) {
      return x + y;
    }
  }

  public void run() {
    SampleSum ss = new X();
    SampleSum tt = (x, y) -> x + y;
    DoubleStr ds = (x, y) -> x + y;

    System.out.println(ss.sum(3, 7));
    System.out.println(tt.sum(3, 7));
    System.out.println(ds.join("3", "7"));
  }
}
