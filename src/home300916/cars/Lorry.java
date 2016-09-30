package home300916.cars;


public class Lorry extends Car {

    private int capacity;

    public Lorry(String brand, int power, double weight){
        this.brand = brand;
        this.power = power;
        this.weight = weight;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void getInfo(){
        System.out.println(this.brand);
        System.out.println(this.capacity);
    }
}
