public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Novel("Война и мир", "Л. Толстой", 1225, "Исторический"),
            new Textbook("Алгебра 9 класс", "Макарычев", 320, "Математика")
        };

        for (Book b : books) {
            b.displayInfo();
            System.out.println();
        }
    }
}
