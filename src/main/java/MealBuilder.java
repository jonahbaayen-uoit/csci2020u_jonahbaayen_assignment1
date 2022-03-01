import food.burgers.*;
import food.drinks.Coffee;
import food.drinks.Coke;
import food.drinks.Pepsi;
import food.meal.Meal;
import food.toppings.Cheese;

/**
 * Builder for creating different types of Meal objects by combining FoodItem objects.
 *
 * @see Meal
 * @see food.FoodItem
 */
public class MealBuilder {
    public Meal standardMeal() {
        Meal meal = new Meal("Standard Meal");
        meal.addItem(new Hamburger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal veggieMeal() {
        Meal meal = new Meal("Veggie Meal");
        meal.addItem(new VeggieBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal deluxeMeal() {
        Meal meal = new Meal("Deluxe Meal");
        meal.addItem(new DoubleCheeseburger());
        meal.addItem(new SpicyDeluxe());
        meal.addItem(new Coffee());
        return meal;
    }

    public Meal megaMeal() {
        Meal meal = new Meal("Mega Meal");

        for (int i = 0; i < 5; i++) {
            meal.addItem(new Cheeseburger());
        }

        for (int i = 0; i < 3; i++) {
            meal.addItem(new Pepsi());
        }

        return meal;
    }
}
