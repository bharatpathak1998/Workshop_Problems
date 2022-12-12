import java.util.ArrayList;
import java.util.Comparator;

public class Marble {
    String color;
    int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Marble{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

class Marbles {
    ArrayList<Marble> list = new ArrayList<>();

    public void add() {
        Marble marble = new Marble();

        marble.setColor("red");
        marble.setPrice(200);

        Marble marble1 = new Marble();
        marble1.setColor("green");
        marble1.setPrice(100);

        Marble marble2 = new Marble();
        marble2.setColor("red");
        marble2.setPrice(150);

        list.add(marble);
        list.add(marble1);
        list.add(marble2);
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            Marble marble = list.get(i);
            System.out.println(marble);
        }
    }

    public void minPrice() {
        list.stream().filter(i -> i.getColor().equals("red"))
                .min(Comparator.comparing(Marble::getPrice))
                .ifPresent(System.out::println);
    }
}

class MarbleMain {
    public static void main(String[] args) {
        Marbles marbles = new Marbles();
        marbles.add();
        marbles.display();
        marbles.minPrice();
    }
}
