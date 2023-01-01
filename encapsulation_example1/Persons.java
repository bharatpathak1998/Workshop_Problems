package encapsulation_example1;

public class Persons {
    Person person;

    void add() {
        person = new Person("Bharat",24);
    }

    void show() {
        System.out.println(person);
    }


    public static void main(String[] args) {

        Persons persons = new Persons();
        persons.add();
        persons.show();
//        Person person = new Person("Bharat",24);
//        System.out.println(person);
    }
}