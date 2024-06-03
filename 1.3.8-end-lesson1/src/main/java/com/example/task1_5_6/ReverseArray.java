package com.example.task1_5_6;

public class ReverseArray {

    public static int[] inverseArray(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[numbers.length - 1 - i];
        }
        return result;
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1] + "]");
    }
}
