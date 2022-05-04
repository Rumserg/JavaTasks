package lesson3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8ball {

    /**
     * Сделать магического шара восьмёрки. Фразы должны находиться в виде строки в ArrayList.
     * Для реализации задачи использовать классы Random и ArrayList.
     * Метод getResult() должен отдавать строковое значение со случайной фразой из массива (ArrayList) строк (фраз).
     * При запускпе программа должна выводить приглашение ввести вопрос (Scanner) и в качестве результата выводить
     * на экран случайную фразу из списка.
     * phrases.add("As I see it, yes");
     * "Ask again later"
     * "Better not tell you now"
     * "Cannot predict now"
     * "Concentrate and ask again"
     * "Don’t count on it"
     * "It is certain"
     * "It is decidedly so"
     * "Most likely"
     * "My reply is no"
     * "My sources say no"
     * "Outlook good"
     * "Outlook not so good"
     * "Reply hazy try again"
     * "Signs point to yes"
     * "Very doubtful"
     * "Without a doubt"
     * "Yes"
     * "Yes, definitely"
     * "You may rely on it"
     */

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ask your question");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.print("Your question line is empty.");
            } else {
                System.out.println(getRandomPhrase());
                break;
            }
        }
    }

    public static String getRandomPhrase() {
        ArrayList<String> phrases = new ArrayList<>();

        phrases.add("As I see it, yes");
        phrases.add("Ask again later");
        phrases.add("Better not tell you now");
        phrases.add("Cannot predict now");
        phrases.add("Concentrate and ask again");
        phrases.add("Don’t count on it");
        phrases.add("It is certain");
        phrases.add("It is decidedly so");
        phrases.add("Most likely");
        phrases.add("My reply is no");
        phrases.add("My sources say no");
        phrases.add("Outlook good");
        phrases.add("Outlook not so good");
        phrases.add("Reply hazy try again");
        phrases.add("Signs point to yes");
        phrases.add("Very doubtful");
        phrases.add("Without a doubt");
        phrases.add("Yes");
        phrases.add("Yes, definitely");
        phrases.add("You may rely on it");

        Random random = new Random();

        return phrases.get(random.nextInt(phrases.size()));
    }
}
