package Week3;

import java.util.ArrayList;

public class BottleDispenser {
    private static float money;
    private static BottleDispenser instance = null;
    private static ArrayList<Bottle> bottleList;
    
    private BottleDispenser() {
        money = 0;
        bottleList = new ArrayList<>();
        bottleList.add(new Bottle("Max", "Pepsi", 0.5, 1.8));
        bottleList.add(new Bottle("Max", "Pepsi", 1.5, 2.2));
        bottleList.add(new Bottle("Zero", "Coca-Cola", 0.5, 2.0));
        bottleList.add(new Bottle("Zero", "Coca-Cola", 1.5, 2.5));
        bottleList.add(new Bottle("Zero", "Fanta", 0.5, 1.95));
        }

    public static BottleDispenser getInstance(){
        if (instance == null)
            instance = new BottleDispenser(); 
        return instance;
    }
    protected void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    protected void buyBottle(int purchase) {
        Bottle b = bottleList.get(purchase-1);
        if (money >= b.getPrice()) {
            money -= b.getPrice();
            System.out.println("KACHUNK! "+ b.getManufacturer() + 
                                " " + b.getName() + " came out of the dispenser!");
            bottleList.remove(purchase - 1);
        }
        else {
            System.out.println("Add money first!");
        }
    }

    protected void returnMoney() {
        String formatted_money = String.format("%.2f", money);
        System.out.println("Klink klink. Money came out! You got "+ formatted_money + "€ back");
        money = 0;
    }

    protected void printBottles(){
    for (int i = 0; i < bottleList.size(); i++) {
        System.out.println(i+1 + ". Name: " + bottleList.get(i).getManufacturer() + " " + bottleList.get(i).getName());
        System.out.println("\tSize: " + bottleList.get(i).getSize() + "\tPrice: " + bottleList.get(i).getPrice());
    }
    }
}
