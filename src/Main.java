//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import edu.misena.senaviewer.model.book;
import edu.misena.senaviewer.model.chapter;
import edu.misena.senaviewer.model.magazine;
import edu.misena.senaviewer.model.movie;
import edu.misena.senaviewer.model.series;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {
    private static Scanner scanner = new Scanner(System.in);

    // Listas para almacenar los objetos
    private static List<movie> movies = new ArrayList<>();
    private static List<book> books = new ArrayList<>();
    private static List<magazine> magazines = new ArrayList<>();
    private static List<chapter> chapters = new ArrayList<>();
    private static List<series> series = new ArrayList<>();

    public static void main(String[] args) {
        // Agregar algunos datos de ejemplo
        initializeData();

        int option;
        do {
            showMainMenu();
            option = getValidOption();
            handleMenuOption(option);
        } while (option != 6);
    }

    private static void showMainMenu() {
        System.out.println("----- SENA VIEWER -----");
        System.out.println("1. Movies");
        System.out.println("2. Books");
        System.out.println("3. Magazines");
        System.out.println("4. Chapters");
        System.out.println("5. Series");
        System.out.println("6. Exit");
        System.out.print("Escoge una opción: ");
    }

    private static int getValidOption() {
        int option = -1;
        while (option < 1 || option > 6) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option < 1 || option > 6) {
                    System.out.println("Selecciona una opción (1-6).");
                }
            } else {
                System.out.println("Opcion Incorrecta. Escoge un numero entre el  1 y 6.");
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
                showChapter();
                break;
            case 5:
                showSeries();
                break;
            case 6:
                System.out.println("Saliendo de la aplicación");
                break;
            default:
                System.out.println("Opción invalida. Intente de nuevo");
                break;
        }
    }

    private static void showMovies() {
        System.out.println("----- MOVIES -----");
        for (movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Creator: " + movie.getCreator());
            System.out.println("Duration: " + movie.getDuration() + " minutes");
            System.out.println("Year: " + movie.getYear());
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

    private static void showChapter() {
        System.out.println("----- Chapters -----");
        for (chapter chapter : chapters) {
            System.out.println("Title: " + chapter.getTitle());
            System.out.println("Duration: " + chapter.getDuration());
            System.out.println("Year: " + chapter.getYear());
            System.out.println();
        }
    }

    private static void showSeries() {
        System.out.println("----- Series -----");
        for (series series : series) {
            System.out.println("Title: " + series.getTitle());
            System.out.println("Duration: " + series.getDuration());
            System.out.println("Year: " + series.getGenre());
            System.out.println();
        }
    }

    private static void initializeData() {
        // Movies
        movies.add(new movie("Inception", "Sci-Fi", "Christopher Nolan", 148, new Date(14,9,21)));
        movies.add(new movie("The Matrix", "Action", "The Wachowskis", 136, new Date(99,03,21)));

        // Books
        books.add(new book("Effective Java", new Date(12,7,31), "Addison-Wesley", 01346));
        books.add(new book("Clean Code", new Date(11,10,11), "Prentice Hall", 01323));

        // Magazines
        magazines.add(new magazine("National Geographic", new Date(17 ,01 ,23), "National Geographic Society"));
        magazines.add(new magazine("Time", new Date(98,05,1), "Time USA, LLC"));

        // Chapters
        chapters.add(new chapter("Inicio", 170, new Date(04,02,23)));

    }
}