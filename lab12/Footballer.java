public class Footballer extends Athlete {
    private int goals;

    public Footballer(String name, int id, int medals, int goals) {
        super(name, id, medals);
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "Footballer{name='" + name + "', " + super.toString() + ", голы=" + goals + "}";
    }
}