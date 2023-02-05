public class Book {
    private String name;
    private int release;

    public Book(String name, int release) {
        this.name = name;
        this.release = release;

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