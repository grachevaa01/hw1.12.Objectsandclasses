public class Book {
    private String name;
    private int release;
    private Author writer;

    public Book(String name, int release, Author writer) {
        this.name = name;
        this.release = release;
        this.writer = writer;

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

}