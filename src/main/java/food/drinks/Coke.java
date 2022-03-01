package food.drinks;

public class Coke extends Drink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 1.50f;
    }

    @Override
    public boolean hasIce() {
        return true;
    }
}
