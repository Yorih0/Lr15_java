public class Soup implements Cookable, Storable {
    private String name;
    private String ingredients;
    private int cookingTime;
    private String expirationDate;
    
    public Soup(String name, String ingredients, int cookingTime, String expirationDate) {
        this.name = name;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
        this.expirationDate = expirationDate;
    }
    
    @Override
    public void cook() {
        System.out.println("Варим суп \"" + name + "\" из: " + ingredients);
        System.out.println("Время приготовления: " + cookingTime + " минут");
    }
    
    @Override
    public int getCookingTime() {
        return cookingTime;
    }
    
    @Override
    public void store() {
        System.out.println("Разливаем суп \"" + name + "\" по контейнерам");
        System.out.println("Ставим в холодильник");
    }
    
    @Override
    public String getExpirationDate() {
        return expirationDate;
    }
    
    public String getName() {
        return name;
    }
    
    public String getIngredients() {
        return ingredients;
    }
    
    @Override
    public String toString() {
        return "Суп: " + name + " (ингредиенты: " + ingredients + ")";
    }
}