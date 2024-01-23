package DesignPattern.CreationalDesignPattern.BuilderPatternDesign;

import java.util.ArrayList;

public class Meal {
    ArrayList<Item> items = new ArrayList<>();
    public void addItems(Item item){
        items.add(item);
    }

    public float getCost(){
         float cost = 0.0f;
         for (Item item: items){
             cost += item.price();
         }
         return cost;
    }

    public void showItems(){
        for (Item item : items){
            System.out.printf("%-15s %-15s\n","Item Name", item.name());
            System.out.printf("%-15s %-15s\n", "Packing is", item.packing().pack());
            System.out.printf("%-15s %-5s\n", "Item price", item.price());
        }
        System.out.printf("%-15s %-5s\n", "Total Cost", getCost());
        System.out.println("-------------------------------------");
    }
}
