package home300916.human;


public class Student extends Man {

    private int yearOfStudy;

    public Student(String name, int age, char sex, double weight) {
        super(name, age, sex, weight);
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void increaseYearOfStudy(int yearOfStudy) {
        this.yearOfStudy += yearOfStudy;
    }

    public void getInfo(){
        System.out.println("yearOfStudy: " + yearOfStudy + "\n" +
                            "name: " + name + "\n" +
                            "age: " + getAge() + "\n" +
                            "sex: " + sex + "\n" +
                            "weight: " + getWeight());
    }
}
