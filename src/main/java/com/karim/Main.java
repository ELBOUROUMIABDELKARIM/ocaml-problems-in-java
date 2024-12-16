package com.karim;

public class Main {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(returnLast(list));
    }


    // Problem 1
    public static <T> T returnLast(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        return recursiveReturnLast(arr, 0);
    }

    private static <T> T recursiveReturnLast(T[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return recursiveReturnLast(arr, index + 1);
    }


}