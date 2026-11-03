public class Basketballer extends Athlete {
    private int points;

    public Basketballer(String name, int id, int medals, int points) {
        super(name, id, medals);
        this.points = points;
    }

    @Override
    public String toString() {
        return "Basketballer{name='" + name + "', " + super.toString() + ", очки=" + points + "}";
    }
}