package homeInterface;

public abstract class Food implements Edible {
    protected int calories;
    protected String flavour;
    protected int weight;

    abstract int getWeight();

    void showInfo(){
        System.out.println(this.getClass().getSimpleName() + "\ncalories: " + calories + "\n" + "salty: " + flavour + "\n" + "weight: " + weight);
    }

}
