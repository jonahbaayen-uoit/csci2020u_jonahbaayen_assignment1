package food.burgers;

import food.toppings.*;

import java.util.Arrays;
import java.util.List;

public class DoubleCheeseburger extends Burger {
    @Override
    public String name() {
        return "Double Cheeseburger";
    }

    @Override
    public float price() {
        return 15.0f;
    }

    @Override
    public int pattyCount() {
        return 2;
    }

    @Override
    public List<Topping> toppings() {
        return Arrays.asList(new Lettuce(), new Ketchup(), new Mayo(), new Cheese());
    }
}
