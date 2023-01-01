package encapsulation_example;

public class Persons {

    Person person = new Person();

    void add() {
        person.setName("Bharat");
        person.setAge(24);
    }

    void show() {
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
        System.out.println(person);
    }
}
