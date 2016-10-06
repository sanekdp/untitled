package homeInterface;

public class Apple extends Food {

    public Apple(int calories, int weight) {
        flavour = SWEET;
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public String getFlavour() {
        return flavour;
    }

    @Override
    int getWeight() {
        return weight;
    }
}
