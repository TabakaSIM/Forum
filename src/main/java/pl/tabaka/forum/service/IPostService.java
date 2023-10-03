package pl.tabaka.forum.service;

import pl.tabaka.forum.models.Post;

import java.util.ArrayList;

public interface IPostService {
    ArrayList<Post> getAllPosts();
}
