public class Book {
    private String name;
    private int release;
    private String Writer;

    public Book(String name, int release, String Writer) {
        this.name = name;
        this.release = release;
        this.Writer = Writer;
    }

    public String getname() {
        return this.name;

    }
    public int getRelease(){
        return this.release;
    }
    public void setrelease (int release) {
        this.release = release;
    }
    public String getWriter(){
        return this.Writer;
    }
}