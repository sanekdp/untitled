package home300916;


import home300916.box.BigBox;
import home300916.box.Box;
import home300916.box.Cat;
import home300916.box.FatCat;
import home300916.builder.Bread;
import home300916.cars.Car;
import home300916.cars.Lorry;
import home300916.human.Student;
import home300916.vector.Point;
import home300916.vector.Vector;

public class Main {

    public static void main(String args[]){
        //testLorry();
        //testStudent();
        //testCat();
        //testFatCat();
        //testVector();

        testBuilder();

    }

    private static void testBuilder() {

        Bread bread1 = new Bread.Baker(3, 1, 1).additive("Корица").salt(1).build();
        Bread bread2 = new Bread.Baker(2, 2, 1).salt(1).build();
        Bread bread3 = new Bread.Baker(4, 1, 2).additive("Паприка").build();

        bread1.getInfo();
        bread2.getInfo();
        bread3.getInfo();

    }

    private static void testVector() {

        Vector vector = new Vector(new Point(10,10), new Point(13,14));

        System.out.println("length vector: " + vector.getLengthVector());

    }

    private static void testCat() {

        Box box = new Box(10,10,10);
        BigBox bigBox = new BigBox(20,20,20);
        Cat cat = new Cat();

        bigBox.inBox(cat);
        box.inBox(cat);
    }

    private static void testFatCat() {

        Box box = new Box(10,10,10);
        BigBox bigBox = new BigBox(20,20,20);
        FatCat fatCat = new FatCat();

        bigBox.inBox(fatCat);
        box.inBox(fatCat);

    }

    private static void testStudent() {
        Student student = new Student("Boris", 18, 'M', 70);
        student.setYearOfStudy(2010);
        student.increaseYearOfStudy(1);

        student.getInfo();
    }

    private static void testLorry(){
        Lorry lorry = new Lorry("BMW", 300, 10);
        lorry.getInfo();

        lorry.setCapacity(20);
        lorry.setBrand("NISSAN");
        lorry.getInfo();
    }

}
