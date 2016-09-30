package home300916.box;


public class BigBox extends Box {
    public BigBox(int height, int width, int length) {
        super(height, width, length);
    }


    @Override
    public void inBox(Cat cat) {
        System.out.println((cat instanceof FatCat ? "FatCat" : "Cat") + " --> BigBox --> Meow");
    }
}
