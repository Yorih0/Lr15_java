class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int pages, String subject) {
        super(title, author, pages);
        this.subject = subject;
    }

    @Override
    public String getGenre() {
        return "Учебник";
    }

    public String getChapterList() {
        return "Список глав учебника по предмету \"" + subject + "\": Глава 1, Глава 2, ...";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Предмет: " + subject);
        System.out.println(getChapterList());
    }

    public String getSubject() { return subject; }
}