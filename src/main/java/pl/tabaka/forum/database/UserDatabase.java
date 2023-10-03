package pl.tabaka.forum.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.tabaka.forum.models.User;

import java.util.ArrayList;

@Repository
public class UserDatabase {
    private final ArrayList<User> userList = new ArrayList<>();

    public UserDatabase() {
        this.userList.add(new User(userList.size(), "admin","admin","karol.krawczyk@gmail.com", User.Rola.ADMIN));
        this.userList.add(new User(userList.size(), "janusz","087d9c5e13bdd64a82bef8e013625c32","janusz.kowalski@gmail.com", User.Rola.USER));
    }

    public User getAdminUser(){
        return this.userList.get(0);
    }
}
