package lesson6.persontask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//не работает, я так и не сообразил почему сравнивает не значения, а ссылки
public class PersonTask {

    private static ArrayList<Person> people = new ArrayList<>();

    static {
        people.add(new Person("Bob", "Adamson", "20", "male"));
        people.add(new Person("Mary", "Evans", "16", "female"));
        people.add(new Person("Todd", "Parson", "31", "male"));
        people.add(new Person("Billy", "Harrington", "40", "male"));
        people.add(new Person("Susan", "Smith", "18", "female"));
        people.add(new Person("Jennifer", "Moore", "12", "female"));
        people.add(new Person("Bob", "Adamson", "20", "male"));
        people.add(new Person("Barbara", "Lewis", "36", "female"));
        people.add(new Person("Bob", "Adamson", "20", "male"));
        people.add(new Person("Robert", "Young", "28", "male"));
        people.add(new Person("William", "Davies", "15", "male"));
        people.add(new Person("Michael", "Ellington", "24", "male"));
        people.add(new Person("Bob", "Adamson", "20", "male"));
        people.add(new Person("Richard", "Brown", "32", "male"));
        people.add(new Person("Donald", "Wilson", "19", "male"));
    }

    public static void main(String[] args) {
        System.out.println("Same persons in the list (opt.1): " + printSameNames());
    }

    private static int printSameNames() {
        Set<Person> uniquePersons = new HashSet<>();
        int counter = 1;

        for (Person person : people) {
            if (!uniquePersons.contains(person)) {
                uniquePersons.add(person);

            } else {
                counter++;
            }
        }

        return counter;
    }
}
