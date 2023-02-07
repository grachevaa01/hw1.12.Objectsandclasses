public class Author {
    private String AuthorName;
    private String AuthorSurname;

    public Author(String AuthorName, String AuthorSurname) {
        this.AuthorName = AuthorName;
        this.AuthorSurname = AuthorSurname;
    }
    public String getAuthorName(){
        return this.AuthorName;
    }
    public String getAuthorSurname(){
        return this.AuthorSurname;
    }
}