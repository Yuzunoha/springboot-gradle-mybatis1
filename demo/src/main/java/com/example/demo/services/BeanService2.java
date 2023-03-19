package com.example.demo.services;

import com.example.demo.beans.MessageBean;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class BeanService2 {

  private final MessageBean messageBean;
}
