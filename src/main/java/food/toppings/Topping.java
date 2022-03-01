package food.toppings;

/**
 * Base-line interface for food toppings.
 * To use, food class must have a list of toppings.
 *
 * Contains attributes common across all food toppings such as name and extra-cost.
 *
 * @see food.burgers.Burger
 */
public interface Topping {
    String name();
    float extraCost();
}
