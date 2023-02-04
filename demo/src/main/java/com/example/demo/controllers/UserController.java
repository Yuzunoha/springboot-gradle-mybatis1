package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.function.UnaryOperator;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

  private final UserService service;
  private final ObjectMapper objectMapper;

  @GetMapping("/")
  public List<User> getAllUsers(Model model) {
    return service.selectAll();
  }

  @PostMapping("/users")
  public String addUser(@Validated @ModelAttribute User user, BindingResult result) {
    try {
      if (result.hasErrors()) {
        return objectMapper.writeValueAsString(result.getAllErrors());
      } else {
        return objectMapper.writeValueAsString(user);
      }
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      return null;
    }
  }

  @GetMapping("/users/{id}")
  public User getUserById(@PathVariable Long id) {
    return service.selectByPrimaryKey(id);
  }

  @GetMapping("/users/delete/{id}")
  public String delete(@PathVariable Long id) {
    UnaryOperator<String> getMsg = (String lastStr) -> "ユーザid:" + id + " のユーザ" + lastStr;
    if (service.selectByPrimaryKey(id) == null) {
      return getMsg.apply("は存在しません。");
    }
    service.deleteByPrimaryKey(id);
    return getMsg.apply("を削除しました。");
  }
}
