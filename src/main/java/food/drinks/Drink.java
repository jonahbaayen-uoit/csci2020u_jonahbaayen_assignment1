package food.drinks;

import food.FoodItem;
import food.toppings.Topping;

/**
 * An abstract implementation of the FoodItem interface.
 *
 * Contains the specific attributes hasIce.
 *
 * @see food.FoodItem
 */
public abstract class Drink implements FoodItem {
    public abstract boolean hasIce();
}
