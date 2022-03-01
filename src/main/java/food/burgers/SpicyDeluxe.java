package food.burgers;

import food.toppings.*;

import java.util.Arrays;
import java.util.List;

public class SpicyDeluxe extends Burger {
    @Override
    public String name() {
        return "Spicy Deluxe";
    }

    @Override
    public float price() {
        return 17.50f;
    }

    @Override
    public int pattyCount() {
        return 1;
    }

    @Override
    public List<Topping> toppings() {
        return Arrays.asList(new Lettuce(),
                new Ketchup(),
                new Mayo(),
                new Cheese(),
                new Bacon(),
                new HotSauce());
    }
}
