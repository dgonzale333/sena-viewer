//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import edu.misena.senaviewer.model.book;
import edu.misena.senaviewer.model.chapter;
import edu.misena.senaviewer.model.magazine;
import edu.misena.senaviewer.model.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    // Listas para almacenar los objetos
    private static List<movie> movies = new ArrayList<>();
    private static List<book> books = new ArrayList<>();
    private static List<magazine> magazines = new ArrayList<>();

    public static void main(String[] args) {
        // Agregar algunos datos de ejemplo
        initializeData();

        int option;
        do {
            showMainMenu();
            option = getValidOption();
            handleMenuOption(option);
        } while (option != 7);
    }

    private static void showMainMenu() {
        System.out.println("----- SENA VIEWER -----");
        System.out.println("1. Movies");
        System.out.println("2. Books");
        System.out.println("3. Magazines");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
    }

    private static int getValidOption() {
        int option = -1;
        while (option < 1 || option > 4) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option < 1 || option > 4) {
                    System.out.println("Please select a valid option (1-4).");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next();  // clear invalid input
            }
        }
        return option;
    }

    private static void handleMenuOption(int option) {
        switch (option) {
            case 1:
                showMovies();
                break;
            case 2:
                showBooks();
                break;
            case 3:
                showMagazines();
                break;
            case 4:
                System.out.println("Exiting the application. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    private static void showMovies() {
        System.out.println("----- MOVIES -----");
        for (movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Genre: " + movie.getGenero());
            System.out.println("Creator: " + movie.getCreator());
            System.out.println("Duration: " + movie.getDuration() + " minutes");
            System.out.println("Year: " + movie.getYear());
            System.out.println("Viewed: " + (movie.Viewed() ? "Yes" : "No"));
            System.out.println();
        }
    }

    private static void showBooks() {
        System.out.println("----- BOOKS -----");
        for (book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Edition Date: " + book.getEditionDate());
            System.out.println("Editorial: " + book.getEditorial());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Readed: " + (book.isReaded() ? "Yes" : "No"));
            System.out.println();
        }
    }

    private static void showMagazines() {
        System.out.println("----- MAGAZINES -----");
        for (magazine magazine : magazines) {
            System.out.println("Title: " + magazine.getTitle());
            System.out.println("Edition Date: " + magazine.getEditionDate());
            System.out.println("Editorial: " + magazine.getEditorial());
            System.out.println();
        }
    }

    private static void initializeData() {
        // Agregar algunas películas de ejemplo
        movies.add(new movie("Inception", "Sci-Fi", "Christopher Nolan", 148, 2010));
        movies.add(new movie("The Matrix", "Action", "The Wachowskis", 136, 1999));

        // Agregar algunos libros de ejemplo
        books.add(new book("Effective Java", "2017", "Addison-Wesley", 0134685997));
        books.add(new book("Clean Code", "2008", "Prentice Hall", 0132350882));

        // Agregar algunas revistas de ejemplo
        magazines.add(new magazine("National Geographic", 2023-07, "National Geographic Society"));
        magazines.add(new magazine("Time", 2023-08, "Time USA, LLC"));
    }
}



