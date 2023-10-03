package pl.tabaka.forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tabaka.forum.database.UserDatabase;

@Service
public class UserService implements IUserService{
    @Autowired
    UserDatabase userDatabase;

    public boolean findUser(){
        return false;
    }
}
