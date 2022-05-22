package lesson4;

/**
 * Написать метод print, который при вызове возвращает строку введенную в параметр метода N раз.
 * Параметров будет два: 1) Фараза 2) число, которое нужно будет вызвать фразу.
 * Подсказка: нужно использовать StringBuilder и цикл for.
 * В main вызвать метод (распечатать).
 */

public class PrintNtimes {
    public static void main(String[] args) {
        System.out.println(print("Phrase you would like to print",10));
    }

    public static String print(String phrase,int number){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < number; i++) {
            builder.append(phrase + " ");
        }

        String result = builder.toString();

        return result;
    }
}
