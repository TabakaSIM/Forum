package pl.tabaka.forum.models;

import lombok.*;
import pl.tabaka.forum.models.User;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PostEntry {
    private User user;

    private String message;

    public PostEntry(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
