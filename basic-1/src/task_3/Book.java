package task_3;

import java.util.Scanner;

public class Book {
    static Title title = new Title();
    static Author author = new Author();
    static Content content = new Content();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Title.title = scanner.nextLine();
        Author.author = scanner.nextLine();
        Content.content = scanner.nextLine();

        System.out.printf("Title is: %s, author is: %s, content is: %s%n", title.show(), author.show(), content.show());
    }
}
