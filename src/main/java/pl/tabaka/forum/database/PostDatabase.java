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
        this.postList.add(new Post("Jak zdobyć Primordial pearls?", "Zamknąłem już z 10 szczelin. Wie ktoś jaka jest na to szansa?"));
        this.postList.add(new Post("Czy ktoś zna dalsze losy thaumcraft'a?", "Widziałem, że thaumcraft 6 nie jest już wspierany. Będzie jakaś kontynuacje tego moda?"));
        this.postList.add(new Post("Post 3","M3"));
        this.postList.add(new Post("Post 4","M4"));
        this.postList.add(new Post("Post 5","M5"));
        this.postList.add(new Post("Post 6","M6 ale bedzie bardzo długi tekst o nie wiadomoczym, poniewaz chce sprawdzic jak w sumei HTML sie zachowa na te stronie. Szkoda że nie działa Latheum :thinking: czy jakoś tak, to by mi przynajmniej wygenerował wiecej tekstu a nie musze pisać. Wiem! To było /lorem, tak nazwywała się ta komenda, może teraz bedzie to dostatycznie długi tekst by się linijka zwineła, a przynajmniej mam taką nadzieję :D"));
        this.postList.add(new Post("Post 7","M7"));
        this.postList.add(new Post("Post 8","M8"));
    }

    public ArrayList<Post> getAllPosts() {
        return postList;
    }
}
