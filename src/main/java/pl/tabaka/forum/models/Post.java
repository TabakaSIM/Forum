package pl.tabaka.forum.models;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import pl.tabaka.forum.database.UserDatabase;

import java.util.ArrayList;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Post {
    private String title;
    private ArrayList<PostEntry> respondList = new ArrayList<>();
    private String firstMessage;

    public Post(String title, String message) {
        this.title = title;
        this.firstMessage = message;
        respondList.add( new PostEntry(new User(0, "admin","admin","karol.krawczyk@gmail.com", User.Rola.ADMIN), message));
    }
}
