package food.burgers;

import food.toppings.*;

import java.util.Arrays;
import java.util.List;

public class Cheeseburger extends Burger {
    @Override
    public String name() {
        return "Cheeseburger";
    }

    @Override
    public float price() {
        return 13.50f;
    }

    @Override
    public int pattyCount() {
        return 1;
    }

    @Override
    public List<Topping> toppings() {
        return Arrays.asList(new Lettuce(), new Ketchup(), new Mayo(), new Cheese());
    }
}
