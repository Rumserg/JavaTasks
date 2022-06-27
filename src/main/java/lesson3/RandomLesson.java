package lesson3;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomLesson {

    /**
     * Используя класс Random, сделать реализацию метода, который будет выдавать случайную фразу из ArrayList.
     * Фраз в ArrayList должно быть четыре, фразы могут быть любые.
     * При запуске программа должна выводить на экран одну случайную фразу из четырех строк, находящихся в ArrayList.
     * Реализацию метода, производящего вывод случайной фразы делать в методе getRandomPhrase()
     */

    public static void main(String[] args) {
        System.out.println(getRandomPhrase());
    }

    public static String getRandomPhrase() {
        //сначала нашел такой метод рандома
        //int num = ThreadLocalRandom.current().nextInt(0,phrases.size());
        //return phrases.get(num);
        ArrayList<String> phrases = new ArrayList<>();
        Random random = new Random();

        phrases.add("фраза 1");
        phrases.add("фраза 2");
        phrases.add("фраза 3");
        phrases.add("фраза 4");

        return phrases.get(random.nextInt(phrases.size()));
    }
}
