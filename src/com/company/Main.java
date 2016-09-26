package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //region Данные для тестирования

        int arrayFirst[] = {1};
        int arraySecond[] = {2};

        int[] newArray = joinArrayWithSorting(arrayFirst, arraySecond);
        System.out.println(Arrays.toString(newArray));

        //endregion
    }

    private static int[] joinArrayWithSorting(int[] array1, int[] array2) {

        int[] newArray = new int[array1.length + array2.length];
        if (array1.length == 0 && array1.length == array2.length) {
            return newArray;
        }
        if (array1.length == 0)
            return array2;
        if (array2.length == 0)
            return array1;
        int[] bigArray = array1.length > array2.length ? array1 : array2;
        int[] smallArray = array1.length <= array2.length ? array1 : array2;
        int indBigArray = 0;
        int indSmallArray = 0;//smallArray.length == 0 ? 1 : 0;

        for (int currInd = 0; currInd < newArray.length; currInd++) {
            //if (indSmallArray < smallArray.length && (indBigArray == bigArray.length || smallArray[indSmallArray] <= bigArray[indBigArray])) {
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