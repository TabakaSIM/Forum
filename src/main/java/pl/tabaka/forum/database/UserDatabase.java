package pl.tabaka.forum.database;

import org.springframework.stereotype.Repository;
import pl.tabaka.forum.models.User;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public class UserDatabase {
    private final ArrayList<User> userList = new ArrayList<>();

    public UserDatabase() {
        this.userList.add(new User(userList.size(), "admin","admin","karol.krawczyk@gmail.com", User.Rola.ADMIN));
        this.userList.add(new User(userList.size(), "janusz","janusz","janusz.kowalski@gmail.com", User.Rola.USER));
    }

    public User getAdminUser(){
        return this.userList.get(0);
    }

    public void addUser(String email, String login, String password) {
        this.userList.add(new User(userList.size(),login, password, email, User.Rola.USER));
    }

    public Optional<User> findUserByLogin(String login, String password){
        for (User user:userList) {
            if(user.matchLogin(login) && user.checkPassword(password)){
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
