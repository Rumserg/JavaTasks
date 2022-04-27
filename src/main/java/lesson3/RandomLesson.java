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
        ArrayList<String> phrases = new ArrayList<String>();
        phrases.add("phrase 1");
        phrases.add("phrase 2");
        phrases.add("phrase 3");
        phrases.add("phrase 4");

        //сначала нашел такой метод рандома
        //int num = ThreadLocalRandom.current().nextInt(0,phrases.size());
        //return phrases.get(num);

        Random random = new Random();
        return phrases.get(random.nextInt(phrases.size()));
    }

}
