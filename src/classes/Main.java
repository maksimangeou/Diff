package classes;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        System.out.println(author1);

        Author author2 = new Author("Александр", "Хрюшкин");
        System.out.println(author2);
        author2.setLastName("Пушкин");

        Book book1 = new Book("Горе от ума", "Александр", "Грибоедов", 2025);
        System.out.println(book1);
        book1.setYearOfPublished(1825);
        System.out.println(book1);

        Book book2 = new Book("Евгений Онегин", author2, 1833);
        System.out.println(book2);
    }
}