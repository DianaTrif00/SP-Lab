import java.util.ArrayList;
import java.util.Iterator;

public class Chapter {
    private String title;
    private ArrayList<SubChapter> subChapters;

    public Chapter(String title) {
        this.title = title;
        this.subChapters = new ArrayList();
    }

    public int addSubChapter(String subChapter) {
        this.subChapters.add(new SubChapter(subChapter));
        return this.subChapters.size() - 1;
    }

    public SubChapter getSubChapterByIndex(int index) {
        return (SubChapter)this.subChapters.get(index);
    }

    public void print() {
        System.out.println("Capitol" + this.title);
        Iterator var1 = this.subChapters.iterator();

        while(var1.hasNext()) {
            SubChapter i = (SubChapter)var1.next();
            i.print();
        }

    }
}
