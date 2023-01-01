package marble_program;

import java.util.ArrayList;
import java.util.List;

public class Marbles {

    List<Marble> list = new ArrayList<>();

    void add() {

        Marble marble = new Marble();
        marble.setColor("red");
        marble.setPrice(150);

        Marble marble1 = new Marble();
        marble1.setColor("red");
        marble1.setPrice(100);

        Marble marble2 = new Marble();
        marble2.setColor("white");
        marble2.setPrice(10);

        Marble marble3 = new Marble();
        marble3.setColor("red");
        marble3.setPrice(20);

        list.add(marble);
        list.add(marble1);
        list.add(marble2);
        list.add(marble3);
    }

    void print() {
        for (Marble print : list) {
            System.out.println(print);
        }
    }

    void min() {
        int min = list.get(0).getPrice();
        for (Marble marble : list) {
            if (marble.getPrice() < min) {
                min = marble.getPrice();
            }
        }
        System.out.println("\nMinimum Price : " + min);
    }

    void minRed() {
        int min = list.get(0).getPrice();
        for (Marble marble : list) {
            if (marble.getPrice() < min && marble.getColor().equals("red")) {
                min = marble.getPrice();
            }
        }
        System.out.println("Minimum Price Of Red marble_Stream_Program.Marble : " + min);
    }
}