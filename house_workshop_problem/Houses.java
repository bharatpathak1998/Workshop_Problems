package house_workshop_problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Houses {

    ArrayList<House> list =new ArrayList<>();

    void add() {
        House house = new House();
        house.setName("Shashank House");
        house.color = "blue";
        house.address = "xyz";
        house.size = "100sqft";
        house.price = 1000000;

        House house1 = new House();
        house1.setName("Bharat House");
        house1.color = "green";
        house1.address = "abc";
        house1.size = "200sqft";
        house1.price = 2000000;

        list.add(house);
        list.add(house1);
    }

    void show() {
        list.forEach(System.out::println);
    }

    void remove(Scanner sc) {
        System.out.println("Enter color name to delete details : ");
        String name = sc.nextLine();
        for (House house : list) {
            if (house.color.equals(name)) {
                list.remove(house);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Houses houses = new Houses();
        Scanner sc = new Scanner(System.in);
        houses.add();
        houses.show();
        houses.remove(sc);
        houses.show();
    }
}
