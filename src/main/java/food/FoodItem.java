package food;

/**
 * Base-line interface for food items.
 * Contains attributes common across all food items such as name and price.
 */
public interface FoodItem {
    String name();
    float price();
}
