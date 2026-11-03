public class Swimmer extends Athlete {
    private int records;

    public Swimmer(String name, int id, int medals, int records) {
        super(name, id, medals);
        this.records = records;
    }

    @Override
    public String toString() {
        return "Swimmer{name='" + name + "', " + super.toString() + ", рекорды=" + records + "}";
    }
}