package home300916.box;

public class Box {

    public final int height;
    public final int width;
    public final int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void inBox(Cat cat){
        System.out.println((cat instanceof FatCat ? "FatCat" : "Cat") + " --> Box --> " + (cat instanceof FatCat ? "It's big cat" : "Meow"));
    }
}
