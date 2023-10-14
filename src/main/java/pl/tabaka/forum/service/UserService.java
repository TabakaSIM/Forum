package pl.tabaka.forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tabaka.forum.Exeptions.UserValidateExeption;
import pl.tabaka.forum.database.UserDatabase;
import pl.tabaka.forum.models.User;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    UserDatabase userDatabase;

    public static Optional<User> user = Optional.empty();

    public boolean findUser(){
        return false;
    }

    @Override
    public boolean registerUser(String email, String login, String password) {
        try {
            validateEmail(email);
            validateLogin(login);
            validatePasword(password);
            this.userDatabase.addUser(email, login, password);
        } catch (UserValidateExeption exeption){
            return false;
        }
        return  true;
    }

    @Override
    public Optional<User> getUserByLogin(String login, String password) {
        return this.userDatabase.findUserByLogin(login, password);
    }

    @Override
    public void login(String login, String password) {
        this.user = this.getUserByLogin(login, password);
    }

    public boolean isPresentUser(){
        return this.user.isPresent();
    }

    @Override
    public Optional<User> getUser() {
        return this.user;
    }

    @Override
    public void logout() {
        this.user = Optional.empty();
    }

    private void validateEmail(String email){
        if(email.length()<2) throw new UserValidateExeption("Email niepoprawny!");
    }

    private void validateLogin(String login){
        if(login.length()<2) throw new UserValidateExeption("Email niepoprawny!");
    }

    private void validatePasword(String password){
        if(password.length()<2) throw new UserValidateExeption("Email niepoprawny!");
    }
}
