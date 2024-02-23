package io.fmathais.jrest.data.user;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import io.fmathais.jrest.domain.user.UserRepository;
import io.fmathais.jrest.domain.user.dtos.NewUser;
import io.fmathais.jrest.domain.user.dtos.User;

public class InMemoryUserRepository implements UserRepository {
  private static final Map<String, User> USERS_STORE = new ConcurrentHashMap<>();

  @Override
  public String create(NewUser user) {
    String id = UUID.randomUUID().toString();
    User u = User.builder()
        .id(id)
        .login(user.getLogin())
        .password(user.getPassword())
        .build();
    USERS_STORE.put(user.getLogin(), u);
    return id;
  }
}
