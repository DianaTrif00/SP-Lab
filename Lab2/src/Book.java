import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    private String title;
    private ArrayList<Chapter> chapters;
    private ArrayList<Author> authors;
    private TableOfContents toc;

    public Book(String title) {
        this.title = title;
        this.chapters = new ArrayList();
        this.authors = new ArrayList();
        this.toc = new TableOfContents();
    }

    public int addChapter(String chapter) {
        this.chapters.add(new Chapter(chapter));
        return this.chapters.size() - 1;
    }

    public Chapter getChapterByIndex(int index) {
        return (Chapter)this.chapters.get(index);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void print() {
        System.out.println("Carte" + this.title);
        this.toc.print();
        System.out.println("Autori: ");
        Iterator var1 = this.authors.iterator();

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
