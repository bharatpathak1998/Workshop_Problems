package bird_repository_set;

import java.util.*;

public class BirdDetails {

    Set<Bird> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    void addDetails() {
        Bird penguin = new Penguin();
        penguin.setId("P001");
        penguin.setName("Penguin");
        penguin.setColor("B&W");
        penguin.setAge(10);
        penguin.setGender("Male");

        Bird penguin1 = new Penguin();
        penguin1.setId("P001");
        penguin1.setName("Penguin");
        penguin1.setColor("B&W");
        penguin1.setAge(10);
        penguin1.setGender("Male");

        Bird duck = new Duck();
        duck.setId("D001");
        duck.setName("Duck");
        duck.setColor("White");
        duck.setAge(5);
        duck.setGender("Female");

        Bird ostrich = new Ostrich();
        ostrich.setId("O001");
        ostrich.setName("Ostrich");
        ostrich.setColor("Black");
        ostrich.setAge(12);
        ostrich.setGender("Female");

        set.add(penguin);
        set.add(penguin1);
        set.add(duck);
        set.add(ostrich);
        System.out.println("Bird Added Successfully.");
    }

    void editDetails() {
        int count = 0;
        if (set.isEmpty()) {
            System.out.println("There Is No Bird Available");
        } else {
            System.out.println("Enter Id Of A Bird To Edit : ");
            String edit = sc.nextLine();
            for (Bird bird : set) {
                if ((bird.getId().equals(edit))) {

                    System.out.print("1.Edit Id ");
                    System.out.print(" 2.Edit Color ");
                    System.out.print(" 3.Edit Name ");
                    System.out.print(" 4.Edit Gender ");
                    System.out.print(" 5.Edit Age ");
                    System.out.print(" 0.Exit\n->");

                    int option = sc.nextInt();
                    sc.nextLine();
                    switch (option) {
                        case 1:
                            System.out.println("Enter New Id : ");
                            bird.setId(sc.nextLine());
                            break;
                        case 2:
                            System.out.println("Enter New Color : ");
                            bird.setColor(sc.nextLine());
                            break;
                        case 3:
                            System.out.println("Enter New Name : ");
                            bird.setName(sc.nextLine());
                            break;
                        case 4:
                            System.out.println("Enter New Gender : ");
                            bird.setGender(sc.nextLine());
                            break;
                        case 5:
                            System.out.println("Enter New Age : ");
                            bird.setAge(sc.nextInt());
                            break;
                        case 0:
                            return;
                        default:
                            System.out.println("Please Choose Valid Option!");
                    }
                    System.out.println(bird);
                    System.out.println("Bird Edited Successfully.");
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Please Enter Valid Id!");
            }
        }
    }

    void deleteDetails() {
        int count = 0;
        if (set.isEmpty()) {
            System.out.println("There Is No Bird Available");
        } else {
            System.out.println("Enter Id Of A Bird To Delete : ");
            String delete = sc.nextLine();
            for (Bird bird : set) {
                if (bird.getId().equals(delete)) {
                    set.remove(bird);
                    System.out.println("Bird Deleted Successfully.");
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Please Enter Valid Id!");
            }
        }
    }

    void showDetails() {
        System.out.println("Number Of Bird Stored : " + set.size());
        if (set.isEmpty()) {
            System.out.println("There Is No Bird Available");
        } else {
            for (Bird bird : set) {
                System.out.println(bird);
            }
        }
    }

    void displaySwim() {
        for (Bird bird : set) {
            if (bird instanceof Swimmable sBird) {
                sBird.swim();
            }
        }
    }

    void displayFly() {
        for (Bird bird : set) {
            if (bird instanceof Flyable sBird) {
                sBird.fly();
            }
        }
    }
}
