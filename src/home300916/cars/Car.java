package home300916.cars;


public class Car {

    protected String brand;
    protected int power;
    protected double weight;

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    protected int getPower() {
        return power;
    }

    protected void setPower(int power) {
        this.power = power;
    }

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
}
