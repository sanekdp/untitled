package home300916.human;


public class Man {

    public final char sex;
    public final String name;
    private int age;
    private double weight;

    public Man(String name, int age, char sex, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
