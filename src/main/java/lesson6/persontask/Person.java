package lesson6.persontask;

import java.util.Objects;

public class Person {

    String name;
    String surname;
    String age;
    String sex;

    public Person(String name, String surname, String age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && surname.equals(person.surname) && age.equals(person.age) && sex.equals(person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, sex);
    }
}
