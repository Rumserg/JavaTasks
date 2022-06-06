package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Написать два метода.
 * 1. Метод для поиска минимального числа из четырех чисел.
 * 1.1. Метод должен принимать в качестве параметра четыре числа.
 * 1.2. Метод должен находить минимальное из них.
 * 1.3. Метод должен возвращать минимальное число в качестве результата.
 * 1.4. Для реализации метода необходимо использовать Collections (List, сортировки)
 * 2. Метод для поиска максимального числа из пяти чисел.
 * 2.1. Метод должен принимать в качестве параметра пять чисел.
 * 2.2. Метод должен находить максимальное из них.
 * 2.3. Метод должен возвращать максимальное число в качестве результата.
 * 2.4. Для реализации метода необходимо использовать Collections (List, сортировки)
 * 3. Реализовать метод, аналогичный пункту #1, однако не используя Collections.min b Math (подсказка - цикл)
 * 4. Реализовать метод, аналогичный пункту #1, однако не используя Collections.max и Math (подсказка - цикл)
 */

public class MinAndMax {
    public static void main(String[] args) {
        System.out.println(minNumber(700,654,908,7));
        System.out.println(maxNumber(700,614,893,900,590));

    }
    public static int minNumber(int a, int b, int c, int d) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        return Collections.min(numbers);
    }
    public static int maxNumber(int a, int b, int c, int d, int e) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(e);
        Collections.sort(numbers);
        return numbers.get(numbers.size() - 1);
    }
}
