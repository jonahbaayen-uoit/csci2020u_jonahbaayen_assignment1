package food.burgers;

import food.toppings.Ketchup;
import food.toppings.Lettuce;
import food.toppings.Mayo;
import food.toppings.Topping;

import java.util.Arrays;
import java.util.List;

public class Hamburger extends Burger {
    @Override
    public String name() {
        return "Hamburger";
    }

    @Override
    public float price() {
        return 12.0f;
    }

    @Override
    public int pattyCount() {
        return 1;
    }

    @Override
    public List<Topping> toppings() {
        return Arrays.asList(new Lettuce(), new Ketchup(), new Mayo());
    }
}
