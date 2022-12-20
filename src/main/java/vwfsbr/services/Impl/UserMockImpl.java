package vwfsbr.services.Impl;

import java.util.ArrayList;
import java.util.List;

import vwfsbr.services.UserDto;
import vwfsbr.services.UserMock;

public class UserMockImpl implements UserMock {
  private List<UserDto> users;

  public UserMockImpl() {
    users = new ArrayList<UserDto>();
    users.add(new UserDto("38518815754", "kleber@mail.com", "Kleber", "Rodrigo", "1234567890"));
  }

  public UserDto obter(String username) {

    for (UserDto user : this.users) {
      if (user.getUsername().equals(username))
        return user;
    }

    return null;
  }

  public boolean autenticar(String username, String password) {
    for (UserDto user : this.users) {
      if (user.getUsername().equals(username))
        return user.getPassword().equals(password);
    }

    return false;
  }
}
