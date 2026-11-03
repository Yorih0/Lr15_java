class Main {
    public static void main(String[] args) {
        Store store1 = new Store("Первый", "Панченко 80", 5);
        Store store2 = new Store();

        System.out.println(store1);
        System.out.println(store2);

        store2.setName("Второй");
        System.out.println(store2.getName());
        store2.setAddress("Скрипникова 18");
        System.out.println(store2.getAddress());
        store2.setEmployeeCount(51);
        System.out.println(store2.getEmployeeCount());
        if(store2.isLarge()){
            System.out.println("Магазин большой");
        }else{
            System.out.println("Магазин маленький");
        }

        Store st = new Store("тест","f",1,52);
    }
}
