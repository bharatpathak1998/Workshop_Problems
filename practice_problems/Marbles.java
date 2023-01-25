package practice_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Marbles {
    ArrayList<Marble> list = new ArrayList<>();

    void add() {

        Marble marble = new Marble();
        marble.setColor("green");
        marble.setPrice(50);

        Marble marble1 = new Marble();
        marble1.setColor("red");
        marble1.setPrice(200);

        Marble marble2 = new Marble();
        marble2.setColor("yellow");
        marble2.setPrice(100);

        Marble marble3 = new Marble();
        marble3.setColor("red");
        marble3.setPrice(140);

        list.add(marble);
        list.add(marble1);
        list.add(marble2);
        list.add(marble3);
    }

    void show() {
//        for (int i = 0; i < list.size(); i++) {
//            Marble marble = list.get(i);
//            System.out.println(marble);
//        }

        for (Marble marble : list) {
            System.out.println(marble);
        }
//        list.forEach(System.out::println);
    }

    void minPrice() {
//        list.stream().min(Comparator.comparing(Marble::getPrice)).ifPresent(System.out::println);

        int min = Integer.MAX_VALUE;

        for (Marble marble : list) {
            if (marble.getPrice() < min) {
                min = marble.getPrice();
                System.out.println(marble);
            }
        }
        System.out.println("Minimum price of marble : " + min);
    }

    void minRedPrice() {
//        list.stream().filter(marble -> marble.getColor().equals("red"))
//                .min(Comparator.comparing(Marble::getPrice)).ifPresent(System.out::println);


        int minPrice = Integer.MAX_VALUE;
        for (Marble marble : list) {
            if (marble.getColor().equals("red") && marble.getPrice() < minPrice) {
                    minPrice = marble.getPrice();
            }
        }
        System.out.println("Minimum price of red marble : " + minPrice);
    }

    void maxPrice() {
//        list.stream().max(Comparator.comparing(Marble::getPrice)).ifPresent(System.out::println);

        int max = Integer.MIN_VALUE;

        for (Marble marble : list) {
            if (marble.getPrice() > max) {
                max = marble.getPrice();
            }
        }
        System.out.println("Maximum price of marble : " + max);

    }

    void maxRedPrice() {
//        list.stream().filter(marble -> marble.getColor().equals("red"))
//                .max(Comparator.comparing(Marble::getPrice)).ifPresent(System.out::println);


        int maxPrice = Integer.MIN_VALUE;
        for (Marble marble : list) {
            if (marble.getColor().equals("red") && marble.getPrice() > maxPrice) {
                maxPrice = marble.getPrice();
            }
        }
        System.out.println("Maximum price of red marble : " + maxPrice);
    }
}