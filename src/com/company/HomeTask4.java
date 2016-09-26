package com.company;

import java.util.Arrays;

public class HomeTask4 {

    public static void main(String[] args) {
        int a[] = {0,4};
        int b[] = {1,2,3};
        int c[] = new int[a.length + b.length];

        int bigArray[] = b.length > a.length ? b : a;
        int smallArray[] = b.length > a.length ? a : b;

        System.arraycopy(bigArray, 0, c, 0, bigArray.length);

        int borier = bigArray.length;

        for (int i = 0; i < smallArray.length; i++ ){
            InserIntoArray(smallArray[i], c, borier++);
        }

        System.out.println(Arrays.toString(c));
    }

    static void InserIntoArray(int unitArray,  int c[], int borier) {
        int j =0;
        for(; j < borier; j++){
            if(unitArray <= c[j]){
                break;
            }
        }
        for (int k = borier; k>j; k--){
            c[k] = c[k-1];
        }
        c[j] = unitArray;
    }
}