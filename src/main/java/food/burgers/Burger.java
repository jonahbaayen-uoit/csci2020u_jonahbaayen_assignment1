package food.burgers;

import food.FoodItem;
import food.toppings.Topping;

import java.util.List;

/**
 * An abstract implementation of the FoodItem interface.
 *
 * Contains the specific attributes pattyCount and a list of toppings.
 *
 * @see food.FoodItem
 * @see Topping
 */
public abstract class Burger implements FoodItem {
    public abstract int pattyCount();
    public abstract List<Topping> toppings();
}
