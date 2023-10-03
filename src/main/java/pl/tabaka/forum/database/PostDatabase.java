package pl.tabaka.forum.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.tabaka.forum.models.Post;
import pl.tabaka.forum.models.User;

import java.util.ArrayList;

@Repository
public class PostDatabase {
    private ArrayList<Post> postList = new ArrayList<>();
    public PostDatabase() {
        this.postList.add(new Post("Test", "Wiadomość"));
        this.postList.add(new Post("Test2", "Wiadomość2"));
    }

    public ArrayList<Post> getAllPosts() {
        return postList;
    }
}
