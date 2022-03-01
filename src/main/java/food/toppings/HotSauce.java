package food.toppings;

public class HotSauce implements Topping {
    @Override
    public String name() {
        return "Hot Sauce";
    }

    @Override
    public float extraCost() {
        return 0.25f;
    }
}
