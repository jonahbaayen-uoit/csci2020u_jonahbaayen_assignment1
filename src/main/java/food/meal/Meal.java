package food.meal;

import food.FoodItem;

import java.util.ArrayList;
import java.util.List;

/**
 * A container that has a list of food items that compose a larger "meal".
 * Also has methods for calculating costs, printing the meal, and adding items.
 */
public class Meal {
    private String name;
    private List<FoodItem> items = new ArrayList<FoodItem>();

    public Meal(String name) {
        this.name = name;
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    /**
     * Calculates the total cost by summing the price of all held food items.
     *
     * @return the sum of all individual food item costs.
     */
    public float getCost() {
        float total = 0.0f;

        for (FoodItem item : items) {
            total += item.price();
        }

        return total;
    }

    /**
     * Prints a description of this meal to the system console.
     */
    public void printMeal() {
        System.out.println("--- " + this.name + ": Total $" + this.getCost() + " ---");
        for (FoodItem item : items) {
            System.out.println(" - " + item.name() + ": $" + item.price());
        }
        System.out.println();
    }
}
