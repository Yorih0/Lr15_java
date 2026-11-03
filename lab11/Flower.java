public class Flower extends Plant {
    private String petalColor;

    public Flower(String name, double height, String petalColor) {
        super(name, height, "Цветок");
        this.petalColor = petalColor;
    }

    @Override
    public String grow() {
        return "Растет очень быстро";
    }

    public String water(String fertilizer, int liters) {
        return "Поливаю цветок удобрением " + fertilizer + " (" + liters + " л)";
    }

    public String getPetalColor() {
        return petalColor;
    }
}