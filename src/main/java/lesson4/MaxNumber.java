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
        System.out.println(maxNumber(10, 26));
        System.out.println(maxNumberMath(104, 201));
    }
    public static int maxNumber(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int maxNumberMath(int a, int b) {
        return Math.max(a, b);
    }
}