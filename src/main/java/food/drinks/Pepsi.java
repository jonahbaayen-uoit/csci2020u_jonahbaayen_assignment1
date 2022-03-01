package food.drinks;

public class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi";
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
