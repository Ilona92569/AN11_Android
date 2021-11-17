package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numberPerson = Utils.numberPerson();
        Person mas[] = Person.mass(numberPerson);
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < mas.length; i++) {
            people.add(mas[i]);
        }
        show(people);
        change(people);
        show(people);
        create(people);
        show(people);
        System.out.println();
        deletePerson(people);
        show(people);
        System.out.println();
        deleteAll(people);
        show(people);
    }

    public static void show(List<Person> people) {
        for (Person personShow :
                people) {
            System.out.println(personShow);
        }
    }

    public static void change(List<Person> people) {
        String name = Utils.interName();
        Person person1 = new Person(name, 1);
        people.set(1, person1);
    }

    public static void create(List<Person> people) {
        Person person1;
        do {
            person1 = new Person(Utils.interName(), Utils.idPerson());
            people.add(person1);
        }
        while (!people.contains(person1));
    }

    public static void deletePerson(List<Person> people) {
        people.remove(people.size() - 1);
    }

    public static void deleteAll(List<Person> people) {
        for (int i = 0; i <= people.size() + 1; i++) {
            people.remove(0);
        }
    }
}
