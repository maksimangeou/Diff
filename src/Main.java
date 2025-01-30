public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        System.out.println(author1.getFirstName() + " " + author1.getLastName());

        Author author2 = new Author("Александр", "Хрюшкин");
        System.out.println(author2.getFirstName() + " " + author2.getLastName());
        author2.setLastName("Пушкин");

        Book book1 = new Book("Горе от ума", "Александр", "Грибоедов", 2025);
        System.out.println(book1.getTitle() + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " " + book1.getYearOfPublished());
        book1.setYearOfPublished(1825);
        System.out.println(book1.getTitle() + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " " + book1.getYearOfPublished());

        Book book2 = new Book("Евгений Онегин", author2, 1833);
        System.out.println(book2.getTitle() + " " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + " " + book2.getYearOfPublished());


    }
}









