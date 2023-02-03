package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

  private final UserService service;

  @GetMapping("/")
  public List<User> getAllUsers(Model model) {
    return service.selectAll();
  }

  @GetMapping("/users/{id}")
  public User getUserById(@PathVariable Long id) {
    return service.selectByPrimaryKey(id);
  }
}
