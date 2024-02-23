package io.fmathais.jrest.domain.user.dtos;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class NewUser {
  String login;
  String password;
}
