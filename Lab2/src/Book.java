import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book {
    String title;
    List<Author> authors = new ArrayList<>();
    List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author newAuthor){
        authors.add(newAuthor);
    }
    public int createChapter(String chapter){
        chapters.add(new Chapter(chapter));
        return chapters.size() - 1;
    }
    public Chapter getChapter(int index){
        return chapters.get(index);
    }
    public String getTitle(){
        return this.title;
    }
    public List<Author> getAuthors(){
        return this.authors;
    }
    public List<Chapter> getChapters(){
        return this.chapters;
    }
}

        while(var1.hasNext()) {
            Author i = (Author)var1.next();
            i.print();
        }

        var1 = this.chapters.iterator();

        while(var1.hasNext()) {
            Chapter i = (Chapter)var1.next();
            i.print();
        }

    }
}
