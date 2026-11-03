class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int pages, String genre) {
        super(title, author, pages);
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return "Роман";
    }

    public String getPlotSummary() {
        return "Краткое содержание романа \"" + title + "\" (" + genre + "): ...";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Поджанр: " + genre);
        System.out.println(getPlotSummary());
    }

    public String getNovelGenre() { return genre; }
}