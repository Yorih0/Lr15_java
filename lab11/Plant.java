public class Plant {
    protected String name;
    protected double height;
    protected String type;

    public Plant(String name, double height, String type) {
        this.name = name;
        this.height = height;
        this.type = type;
    }

    public String water() {
        return "Поливаю растение";
    }

    public String water(int liters) {
        return "Поливаю " + liters + " литрами";
    }

    public String water(String time) {
        return "Поливаю " + time;
    }

    public String grow() {
        return "Растет медленно";
    }
}