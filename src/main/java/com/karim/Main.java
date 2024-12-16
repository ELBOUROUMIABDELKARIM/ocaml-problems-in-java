package com.karim;

public class Main {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(findKthElement(list, 5));
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

    //Problem 3
    private static <T> T findKthElement(T[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 1 || k > arr.length) {
            return null;
        }
        return recursiveKthelement(arr, k-1, 0);
    }

    private static <T> T recursiveKthelement(T[] arr, int k, int index) {
        if (index == k) {
            return arr[index];
        }
        return recursiveKthelement(arr, k, index + 1);
    }

}