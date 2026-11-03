public class Pizza implements Cookable, Storable {
    private String name;
    private String toppings;
    private int cookingTime;
    private String expirationDate;
    
    public Pizza(String name, String toppings, int cookingTime, String expirationDate) {
        this.name = name;
        this.toppings = toppings;
        this.cookingTime = cookingTime;
        this.expirationDate = expirationDate;
    }
    
    @Override
    public void cook() {
        System.out.println("Готовим пиццу \"" + name + "\" с начинкой: " + toppings);
        System.out.println("Время приготовления: " + cookingTime + " минут");
    }
    
    @Override
    public int getCookingTime() {
        return cookingTime;
    }
    
    @Override
    public void store() {
        System.out.println("Упаковываем пиццу \"" + name + "\" в коробку");
        System.out.println("Ставим в холодильник");
    }
    
    @Override
    public String getExpirationDate() {
        return expirationDate;
    }
    
    public String getName() {
        return name;
    }
    
    public String getToppings() {
        return toppings;
    }
    
    @Override
    public String toString() {
        return "Пицца: " + name + " (начинка: " + toppings + ")";
    }
}