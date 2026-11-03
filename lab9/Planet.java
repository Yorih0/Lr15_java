public class Planet extends CelestialBody {
    private int moons;
    
    public Planet(String name, double mass, double diameter, int moons) {
        super(name, mass, diameter);
        this.moons = moons;
    }
    
    @Override
    public String getType() {
        return "Планета";
    }
    
    @Override
    public double calculateGravity() {
        double radius = diameter / 2;
        return 9.8 * (mass / (radius * radius));
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество спутников: " + moons);
        System.out.println();
    }
    
    public int getMoons() {
        return moons;
    }
}