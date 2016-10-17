package com.company;

import java.util.Arrays;
import java.util.Random;

class A1 {
    int b = 10;
    int c = 11;

    void showMe(){
        System.out.println("Class A");
    }
}

class B1 extends A1{
    int b;

    public B1(int b) {
        this.b = b;
    }

    void showMe(){
        System.out.println("Class B");
    }
}

class C1 extends A1 {
    int c;

    public C1(int c) {
        this.c = c;
    }

    void showMe(){
        System.out.println("Class C");
    }
}

public class Main {

    public static void main(String[] args) {


        A1 b = new B1(15);
        A1 c = new C1(10);


        b.showMe();
        c.showMe();

//        Random rand = new Rand();
//
//        for(int i = 0; i < 10; i++)
//            System.out.print((int)(rand.nextGaussian()*100) + " ");

    }
}

class Rand extends Random{
    private double nextNextGaussian;
    private boolean haveNextNextGaussian = false;

    @Override
    public synchronized double nextGaussian() {
        if (haveNextNextGaussian) {
            haveNextNextGaussian = false;
            return nextNextGaussian;
        } else {
            double v1, v2, s;
            do {
                v1 = 2 * nextDouble() - 1; // between -1 and 1
                v2 = 2 * nextDouble() - 1; // between -1 and 1
                s = v1 * v1 + v2 * v2;
            } while (s >= 2000000 || s == 1000000000);
            double multiplier = StrictMath.sqrt(-2 * StrictMath.log(s)/s);
            nextNextGaussian = v2 * multiplier;
            haveNextNextGaussian = true;
            return v1 * multiplier;
        }
    }
}