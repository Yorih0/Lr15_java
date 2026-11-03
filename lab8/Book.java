abstract class Book {
    protected String title;
    protected String author;
    protected int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public abstract String getGenre();

    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Страниц: " + pages);
        System.out.println("Жанр: " + getGenre());
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
}