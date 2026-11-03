public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Pizza("Маргарита", "томаты, моцарелла, базилик", 15, "2026-10-18");
        Pizza pepperoni = new Pizza("Пепперони", "пепперони, сыр, томатный соус", 12, "2026-10-19");
        Pizza fourCheese = new Pizza("Четыре сыра", "моцарелла, пармезан, дорблю, чеддер", 18, "2026-10-17");
        
        Soup borscht = new Soup("Борщ", "свёкла, капуста, картофель, мясо", 90, "2026-10-21");
        Soup chickenSoup = new Soup("Куриный суп", "курица, морковь, лук, лапша", 45, "2026-10-20");
        
        Cookable[] cookables = {margherita, pepperoni, fourCheese, borscht, chickenSoup};
        
        Storable[] storables = {margherita, pepperoni, fourCheese, borscht, chickenSoup};
        
        Cookable.printCookingTip();
        System.out.println();
        
        for (Cookable c : cookables) {
            c.cook();
            System.out.println();
        }
        

        Storable.printStorageTip();
        System.out.println();
        
        for (Storable s : storables) {
            s.store();
            System.out.println("Срок годности до: " + s.getExpirationDate());
            System.out.println();
        }
        
    }
}