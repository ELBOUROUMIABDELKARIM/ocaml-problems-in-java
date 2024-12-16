package com.karim;

public class Main {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(returnLastTwo(list));
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


    // Problem 2
    record Pair<T>(T first, T second) { }

    public static <T> Pair<T> returnLastTwo(T[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        return recursiveReturnLastTwo(arr, 0);
    }

    private static <T> Pair<T> recursiveReturnLastTwo(T[] arr, int index) {
        if (index == arr.length - 2) {
            return new Pair<>(arr[index], arr[index + 1]);
        }
        return recursiveReturnLastTwo(arr, index + 1);
    }

}