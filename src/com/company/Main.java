package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arrayFirst[] = {1};
        int arraySecond[] = {2};

        int[] newArray = joinArrayWithSorting(arrayFirst, arraySecond);
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] joinArrayWithSorting(int[] array1, int[] array2) {

        if (array1.length == 0 && array1.length == array2.length)
            return array1;
        if (array1.length == 0)
            return array2;
        if (array2.length == 0)
            return array1;
        int[] newArray = new int[array1.length + array2.length];
        int[] bigArray = array1.length > array2.length ? array1 : array2;
        int[] smallArray = array1.length <= array2.length ? array1 : array2;
        int indBigArray = 0;
        int indSmallArray = 0;

        for (int currInd = 0; currInd < newArray.length; currInd++) {
            if (indSmallArray < smallArray.length && smallArray[indSmallArray] <= bigArray[indBigArray]) {
                newArray[currInd] = smallArray[indSmallArray];
                indSmallArray++;
            } else {
                newArray[currInd] = bigArray[indBigArray];
                indBigArray++;
            }
        }
        return newArray;
    }
}