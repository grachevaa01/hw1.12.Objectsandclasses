public class Main {

    public static void main(String[] args) {
        Author author  = new Author("Иван ", "Тургенев ");
        Book FathersAndSons =new Book("Отцы и дети ", 1860, author );
        System.out.println("Отцы и дети = " + FathersAndSons.getname());
        System.out.println("Год выпуска = " + FathersAndSons.getRelease());
        FathersAndSons.setrelease(1861);
        System.out.println("FathersAndSons.getRelease() = " + FathersAndSons.getRelease());
        System.out.println("Name " + author.getAuthorName());
        System.out.println("Surname " + author.getAuthorSurname());
        Author dostoevsky = new Author ("Федор", "Достоевский");
        Book Player = new Book("Игрок ", 1866, dostoevsky);
        System.out.println("Игрок " + Player.getname());
        System.out.println("Год выпуска " + Player.getRelease());
        Player.setrelease(1866);
        System.out.println("Player.getRealease()= " + Player.getRelease());
        Author author1 = new Author("Федор ", "Достоевский ");
        System.out.println("Name " + author1.getAuthorName());
        System.out.println("Surname " + author1.getAuthorSurname());
    }
}