package io.fmathais.jrest.domain.user.dtos;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {
  String id;
  String login;
  String password;
}