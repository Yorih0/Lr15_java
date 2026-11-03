public class Tree extends Plant {
    private int trunkDiameter;

    public Tree(String name, double height, int trunkDiameter) {
        super(name, height, "Дерево");
        this.trunkDiameter = trunkDiameter;
    }

    @Override
    public String grow() {
        return "Растет быстро";
    }

    public String water(int liters, String season) {
        return "Поливаю дерево " + liters + " литрами " + season;
    }

    public int getTrunkDiameter() {
        return trunkDiameter;
    }
}