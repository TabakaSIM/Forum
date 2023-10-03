package pl.tabaka.forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tabaka.forum.database.PostDatabase;
import pl.tabaka.forum.models.Post;

import java.util.ArrayList;

@Service
public class PostService implements IPostService{

    @Autowired
    private PostDatabase postDatabase;

    @Override
    public ArrayList<Post> getAllPosts() {
        return this.postDatabase.getAllPosts();
    }
}
