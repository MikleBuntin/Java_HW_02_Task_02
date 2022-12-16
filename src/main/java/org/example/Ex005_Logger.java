//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
//        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
//        fh.setFormatter(xml);
        logger.log(Level.INFO, "Program starting");
//        logger.info("Test log 2");


        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Привет! ");
        System.out.printf("Введте размер числового массива: ");
        String input_text = iScanner.nextLine();
        int arr_len = Integer.parseInt(input_text);
        iScanner.close();
        logger.log(Level.INFO, "Получили число - размер массива = " + arr_len);


        int[] array = new int[arr_len];
        logger.log(Level.INFO, "Создали массив заданного размера");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
//            System.out.println("Array[i]: " + array[i]);
        }
        logger.log(Level.INFO, "Заполнили массив случайными данными");
        System.out.print("Array: [");
        for (int i = 0; i < arr_len; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
        logger.log(Level.INFO, "Вывели неотсортированный массив в консоль");

        boolean flag = true;
        logger.log(Level.INFO, "Start array sorting");
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

            logger.log(Level.INFO, "Сортировка массива.");

                }
        logger.log(Level.INFO, "Сортировка массива окончена.");
        System.out.print("Sorted array: [");
        for (int i = 0; i < arr_len; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
        logger.log(Level.INFO, "Вывели массив в консоль.");
    }
}