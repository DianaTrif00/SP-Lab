import java.util.ArrayList;
import java.util.List;

public class Book {
    public String name;
    public List<String> paragrafe;
    public List<String> imagini;
    public List<String> tabel;

    public Book(String name) {
        this.name = name;
        this.paragrafe = new ArrayList();
        this.imagini = new ArrayList();
        this.tabel = new ArrayList();
    }

    public void createNewParagraph(String paragraf) {
        this.paragrafe.add(paragraf);
    }

    public void createNewImage(String imagine) {
        this.imagini.add(imagine);
    }

    public void createNewTable(String tabele) {
        this.tabel.add(tabele);
    }

    public void print() {
        System.out.println(this.paragrafe);
        System.out.println(this.imagini);
        System.out.println(this.tabel);
    }
} 
