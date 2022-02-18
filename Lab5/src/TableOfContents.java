/**
 * TableOfContents
 */
public class TableOfContents implements Element {
    String title;

    public TableOfContents(String title) {
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println(this.title);
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = title;
    }
}
