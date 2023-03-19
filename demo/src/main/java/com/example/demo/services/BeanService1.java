package com.example.demo.services;

import com.example.demo.beans.MessageBean;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class BeanService1 {

  private final MessageBean messageBean;
}
