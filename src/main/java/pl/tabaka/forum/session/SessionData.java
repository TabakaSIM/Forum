package pl.tabaka.forum.session;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pl.tabaka.forum.models.User;
import pl.tabaka.forum.service.IUserService;

import java.util.Optional;

@NoArgsConstructor
@Getter
@Setter
@Component
@SessionScope
public class SessionData {
    public static Optional<User> user = Optional.empty();

    public boolean isAdmin() {
        return true;
        //return this.user.get().isAdmin();
    }

    public void login(IUserService userService, String login, String password) {

    }
}
