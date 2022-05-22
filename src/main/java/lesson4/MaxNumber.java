package lesson4;

import java.util.Scanner;

/**
 * ВАРИАНТ 1:
 * Написать метод, принимающий в качестве параметра два числа.
 * Метод должен находить максимальное из этих двух чисел.
 * Метод должен возвращать максимальное число как результат.
 * Вызвать метод и main с параметрами, убедиться что показывается максимальное из двух чисел.
 *
 * Дополнительное условие: нельзя использовать библиотеку Math.
 *
 * ВАРИАНТ 2:
 * Дополнительно реализовать аналогичный первому варианту метод в этом же классе, однако используя
 * библиотеку Math.
 * Вызвать метод и main с параметрами, убедиться что показывается максимальное из двух чисел.
 */

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int numberOne = scanner.nextInt();
        System.out.println("enter the second number");
        int numberTwo = scanner.nextInt();
            if (numberOne > numberTwo) {
                System.out.println("the largest number is " + numberOne);
            } else {
                System.out.println("the largest number is " + numberTwo);
            }
        System.out.println("the largest number with Math is " + Math.max(numberOne, numberTwo));
    }
}