public class Star extends CelestialBody {
    private double temperature;
    
    public Star(String name, double mass, double diameter, double temperature) {
        super(name, mass, diameter);
        this.temperature = temperature;
    }
    
    @Override
    public String getType() {
        return "Звезда";
    }
    
    @Override
    public double calculateGravity() {
        return 6.6743*Math.pow(10,-11)* getMass() / Math.pow(getDiameter()/2,2);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Температура: " + temperature + " K");
        System.out.println();
    }
    
    public double getTemperature() {
        return temperature;
    }
}