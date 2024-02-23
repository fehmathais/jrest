package io.fmathais.jrest.domain.user;

import io.fmathais.jrest.domain.user.dtos.NewUser;

public interface UserRepository {
  String create(NewUser user);
}
