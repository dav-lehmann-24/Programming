import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

public class BookStream {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("J.K. Rowling", "Harry Potter", 15.99),
            new Book("Stephen King", "Misery", 12.99),
            new Book("George R.R. Martin", "A Game of Thrones", 25.00),
            new Book("J.K. Rowling", "Fantastic Beasts", 18.99),
            new Book("Stephen King", "The Shining", 14.99),
            new Book("George R.R. Martin", "A Clash of Kings", 30.00)
        );

        Map<String, Double> result = books.stream()
            .sorted((b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()))
            .filter(b -> b.getPrice() < 50)
            .collect(Collectors.groupingBy(
                Book::getAuthor,
                Collectors.averagingDouble(Book::getPrice)
            ));

        System.out.println("Durchschnittliche Preis pro Autor:");
        result.forEach((author, averagePrice) ->
            System.out.printf("%s: %.2f€\n", author, averagePrice)
        );
    }
}