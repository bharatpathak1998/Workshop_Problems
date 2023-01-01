import java.util.Scanner;

public class Bag {
    int maxCapacity = 12;
    int red = 0;
    int green = 0;
    int blue = 0;
    int yellow = 0;

    void addBall(String color) {
        if (maxCapacity == 0) {
            System.out.println("Bag is full.");
        } else {
            if (color.equals("red")) {
                if (red <= (green * 2)) {
                    red++;
                    maxCapacity--;
                    System.out.println("Added Successfully");
                } else {
                    System.out.println("Red balls cannot be more than double the green balls.");
                }
            } else if (color.equals("yellow")) {
                if (yellow < maxCapacity * 40 / 100) {
                    yellow++;
                    maxCapacity--;
                    System.out.println("Added Successfully");
                } else {
                    System.out.println("Not more than 40% of the balls may be yellow.");
                }
            } else if (color.equals("green")) {
                if (green < 3) {
                    green++;
                    maxCapacity--;
                    System.out.println("Added Successfully");
                } else {
                    System.out.println("Max of 3 green balls allowed.");
                }
            } else if (color.equals("blue")) {
                blue++;
                maxCapacity--;
                System.out.println("Added Successfully");
            } else {
                System.out.println("Please enter correct color!");
            }
        }
    }

    void print() {
        System.out.println("Red Balls : " + red);
        System.out.println("Green Balls : " + green);
        System.out.println("Blue Balls : " + blue);
        System.out.println("Yellow Balls : " + yellow);
    }

    public static void main(String[] args) {
        Bag bag = new Bag();
        Scanner sc = new Scanner(System.in);

        boolean exit = true;

        while (exit) {
            System.out.print("1.Add ball  2.Display ball  0.Exit\n->");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the color name you want to add[red, blue, green and yellow] : ");
                    String name = sc.next();
                    bag.addBall(name);
                    break;
                case 2:
                    bag.print();
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    System.out.println("Please choose valid option!");

            }
        }
    }
}