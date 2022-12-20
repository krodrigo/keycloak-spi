package vwfsbr.services;

public interface UserMock {
  UserDto obter(String username);

  boolean autenticar(String username, String password);
}
