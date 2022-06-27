package lesson6;

import java.util.ArrayList;
//не работает, я так и не сообразил почему сравнивает не значения, а ссылки
public class PersonTask {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

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

        System.out.println(people);

        ArrayList duplicate = new ArrayList();
        for (int i = 0; i < people.size(); i++) {
            Person e1 = people.get(i);
            if (e1 == null) continue;
            for (int j = 0; j < people.size(); j++) {
                if (i == j) continue;
                Person e2 = people.get(j);
                if (e1.equals(e2)) {
                    duplicate.add(e2);
                }
            }
        }
        System.out.println(duplicate.size());
    }

    static class Person {

        String name;
        String surname;
        String age;
        String sex;

        public Person(String name, String surname, String age, String sex) {
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            if (obj.getClass() != this.getClass()) {
                return false;
            }

            final Person other = (Person) obj;
            if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
                return false;
            }

            if ((this.surname == null) ? (other.surname != null) : !this.surname.equals(other.surname)) {
                return false;
            }

            if (this.age != other.age) {
                return false;
            }

            if ((this.sex == null) ? (other.sex != null) : !this.sex.equals(other.sex)) {
                return false;
            }

            return true;
        }

    }
}
