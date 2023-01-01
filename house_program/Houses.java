package house_program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Houses {
    List<House> list = new ArrayList<>();

    void add() {
        House house = new House();
        house.setColor("violet");
        house.setPrice(25);

        House house1 = new House();
        house1.setColor("Yellow");
        house1.setPrice(5);

        House house2 = new House();
        house2.setColor("violet");
        house2.setPrice(22);

        House house3 = new House();
        house3.setColor("violet");
        house3.setPrice(10);

        list.add(house);
        list.add(house1);
        list.add(house2);
        list.add(house3);
    }

    void display() {
        list.forEach(System.out::println);
    }

    void price() {
        System.out.print("min Price : ");
        list.stream().filter(i->i.color.equals("violet")).min(Comparator.comparing(House::getPrice)).ifPresent(System.out::println);

        System.out.print("Max Price : ");
        list.stream().max(Comparator.comparing(House::getPrice)).ifPresent(System.out::println);
    }
}
