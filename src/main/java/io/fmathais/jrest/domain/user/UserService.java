package io.fmathais.jrest.domain.user;

import io.fmathais.jrest.domain.user.dtos.NewUser;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public String create(NewUser user) {
    return userRepository.create(user);
  }
}
