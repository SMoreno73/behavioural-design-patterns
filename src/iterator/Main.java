package iterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear la biblioteca digital
        DigitalLibrary library = new DigitalLibrary();

        // Crear categorías y agregar elementos
        LibraryCategory booksCategory = new LibraryCategory("Books");
        booksCategory.addItem(new Book("Java Programming"));
        booksCategory.addItem(new Book("Data Structures and Algorithms"));

        LibraryCategory magazinesCategory = new LibraryCategory("Magazines");
        magazinesCategory.addItem(new Magazine("National Geographic"));
        magazinesCategory.addItem(new Magazine("Time"));

        library.addCategory(booksCategory);
        library.addCategory(magazinesCategory);

        // Interactuar con la biblioteca digital
        System.out.println("¡Bienvenido a la biblioteca digital!");
        System.out.println("Categorías disponibles:");
        System.out.println("1. " + booksCategory.getTitle());
        System.out.println("2. " + magazinesCategory.getTitle());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, seleccione una categoría (1 o 2): ");
        int choice = scanner.nextInt();

        LibraryCategory selectedCategory;
        if (choice == 1) {
            selectedCategory = booksCategory;
        } else if (choice == 2) {
            selectedCategory = magazinesCategory;
        } else {
            System.out.println("Selección inválida. Saliendo del programa.");
            return;
        }

        System.out.println("Elementos en la categoría '" + selectedCategory.getTitle() + "':");
        for (LibraryItem item : selectedCategory.getItems()) {
            System.out.println("- " + item.getTitle());
        }
    }
}