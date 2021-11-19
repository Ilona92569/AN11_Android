package task3;

public class Person {
    private String name;
    private int id;

    public Person(final String name, final int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static Person[] mass(int numberPerson) {
        Person mas[] = new Person[numberPerson];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Person(Utils.interName(), i);
        }
        return mas;
    }
}
