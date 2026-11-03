public class Athlete {
    protected String name;
    protected int id;
    protected int medals;

    public Athlete(String name, int id, int medals) {
        this.name = name;
        this.id = id;
        this.medals = medals;
    }

    @Override
    public String toString() {
        return String.format("id=%d, медали=%d", id, medals);
    }
}