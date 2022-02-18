public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(this.name);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
