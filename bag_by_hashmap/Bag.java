package bag_by_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bag {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 0);
        map.put("green", 0);
        map.put("red", 0);
        map.put("yellow", 0);

        System.out.println("A bag can hold a maximum of 12 balls");

        Scanner sc = new Scanner(System.in);

        while (map.get("blue") + map.get("green") + map.get("red") + map.get("yellow") < 12) {
            System.out.println("Enter ball color (blue, green, red or yellow) : ");
            String color = sc.next();
            switch (color) {
                case "blue":
                    map.put("blue", map.get("blue") + 1);
                    break;
                case "green":
                    if (map.get("red") > 2 * map.get("green") && map.get("green") < 3) {
                        map.put("green", map.get("green") + 1);
                    } else {
                        System.out.println("Cannot add green ball");
                    }
                    break;
                case "red":
                    if (map.get("red") <= 2 * map.get("green")) {
                        map.put("red", map.get("red") + 1);
                    } else {
                        System.out.println("Cannot add red ball");
                    }
                    break;
                case "yellow":
                    if (map.get("yellow") <= (map.get("blue") + map.get("green") + map.get("red")) / 3) {
                        map.put("yellow", map.get("yellow") + 1);
                    } else {
                        System.out.println("Cannot add yellow ball");
                    }
                    break;
            }
        }

        System.out.println("\nBlue balls : " + map.get("blue"));
        System.out.println("Green balls : " + map.get("green"));
        System.out.println("Red balls : " + map.get("red"));
        System.out.println("Yellow balls : " + map.get("yellow"));
    }
}
