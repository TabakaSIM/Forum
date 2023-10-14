package pl.tabaka.forum;

import pl.tabaka.forum.models.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new User(0, "admin","admin","karol.krawczyk@gmail.com", User.Rola.ADMIN).getRola());
    }
}