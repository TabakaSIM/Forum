package pl.tabaka.forum.models;

import lombok.*;
import org.apache.commons.codec.digest.DigestUtils;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private int id;
    private String login;
    private String password;
    private String email;
    private Rola rola;

    public User(int id, String login, String password, String email, User.Rola rola) {
        this.id = id;
        this.login = login;
        this.password = DigestUtils.md5Hex(password);
        this.email = email;
        this.rola = Rola.USER;
    }

    public boolean checkPassword(String haslo){
        return DigestUtils.md5Hex(haslo).equals(this.password);
    }

    public boolean matchLogin(String login) {
        return this.login.equals(login);
    }

    public enum Rola {
        ADMIN,
        USER
    }

    @Override
    public String toString(){
        return this.email+this.login+this.password+(this.rola == Rola.USER);
    }

    public boolean isAdmin(){return this.rola == Rola.ADMIN;}
}
