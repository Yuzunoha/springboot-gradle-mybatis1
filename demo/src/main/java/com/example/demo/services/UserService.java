package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserService {

  private final UserMapper mapper;

  public List<User> selectAll() {
    return mapper.selectAll();
  }

  public User selectByPrimaryKey(Long id) {
    return mapper.selectByPrimaryKey(id);
  }

  public void save(User user) {
    if (user.getId() == null) {
      mapper.insert(user);
    } else {
      mapper.updateByPrimaryKey(user);
    }
  }

  public void deleteByPrimaryKey(Long id) {
    mapper.deleteByPrimaryKey(id);
  }
}
