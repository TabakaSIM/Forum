package pl.tabaka.forum.service;

import pl.tabaka.forum.models.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> user = Optional.empty();
    boolean registerUser(String email, String login, String password);

    Optional<User> getUserByLogin(String login, String password);

    void login(String login, String password);

    boolean isPresentUser();

    Optional<User> getUser();

    void logout();
}
