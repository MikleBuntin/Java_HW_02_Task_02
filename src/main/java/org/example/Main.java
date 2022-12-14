//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Привет! ");
        System.out.printf("Введте размер числового массива: ");
        String input_text = iScanner.nextLine();
        int arr_len = Integer.parseInt(input_text);
        iScanner.close();

        int[] array = new int[arr_len];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
//            System.out.println("Array[i]: " + array[i]);
        }

        System.out.print("Array: [");
        for (int i = 0; i < arr_len; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");

        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.print("Sorted array: [");
        for (int i = 0; i < arr_len; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }
}