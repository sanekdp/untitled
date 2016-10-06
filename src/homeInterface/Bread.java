package homeInterface;

public class Bread extends Food {

    public Bread(int calories, int weight) {
        flavour = SALTY;
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
