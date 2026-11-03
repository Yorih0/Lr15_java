abstract class CelestialBody{
	protected String name;
	protected double mass;
	protected double diameter;

	public CelestialBody(){}

	public CelestialBody(String n,double m , double d){
		name = n;
		mass = m;
		diameter = d;
	}

	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}

	public double getMass(){
		return mass;
	}
	public void setMass(int m){
		mass = m;
	}

	public double getDiameter(){
		return diameter;
	}
	public void setDiameter(double d){
		diameter = d;
	}


	public void displayInfo() {
        System.out.println("=== " + getType() + " ===");
        System.out.println("Название: " + name);
        System.out.println("Масса: " + mass + " кг");
        System.out.println("Диаметр: " + diameter + " км");
        System.out.println("Гравитация: " + calculateGravity() + " м/с*c");
        System.out.println();
    }

    public abstract String getType();

    public abstract double calculateGravity();
}