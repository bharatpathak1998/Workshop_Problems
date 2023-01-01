package bird_repository_list_map_enum;

import java.util.*;

public class BirdDetails {
    List<Bird> list;
    Map<String, List<Bird>> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    private void addBirdDetails() {
        Bird penguin = new Penguin();
        penguin.setId("P001");
        penguin.setName("Penguin");
        penguin.setColor("B&W");
        penguin.setAge(10);
        penguin.setGender(Bird.Gender.MALE);

        Bird penguin1 = new Penguin();
        penguin1.setId("P001");
        penguin1.setName("Penguin");
        penguin1.setColor("B&W");
        penguin1.setAge(10);
        penguin1.setGender(Bird.Gender.MALE);

        Bird duck = new Duck();
        duck.setId("D001");
        duck.setName("Duck");
        duck.setColor("White");
        duck.setAge(5);
        duck.setGender(Bird.Gender.OTHERS);

        Bird ostrich = new Ostrich();
        ostrich.setId("O001");
        ostrich.setName("Ostrich");
        ostrich.setColor("Black");
        ostrich.setAge(12);
        ostrich.setGender(Bird.Gender.FEMALE);

        list.add(penguin);
        list.add(penguin1);
        list.add(duck);
        list.add(ostrich);
        System.out.println("Bird Added Successfully");
    }

    private void updateBirdDetails() {
        int count = 0;
        if (list.isEmpty()) {
            System.out.println("There Is No Bird Available");
        } else {
            System.out.println("Enter Id Of A Bird To Edit : ");
            String edit = sc.nextLine();
            for (Bird bird : list) {
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
                            updateGender(bird);
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
                    System.out.println("Bird Edited Successfully");
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Please Enter Valid Id!");
            }
        }
    }

    private void removeBirdDetails() {
        int count = 0;
        if (list.isEmpty()) {
            System.out.println("There Is No Bird Available");
        } else {
            System.out.println("Enter Id Of A Bird To Delete : ");
            String delete = sc.nextLine();
            for (Bird bird : list) {
                if (bird.getId().equals(delete)) {
                    list.remove(bird);
                    System.out.println("Bird Deleted Successfully");
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Please Enter Valid Id!");
            }
        }
    }

    private void printBirdDetails() {
        System.out.println("Number Of Bird Stored : " + list.size());
        if (list.isEmpty()) {
            System.out.println("There Is No Bird Available");
        } else {
            for (Bird bird : list) {
                System.out.println(bird);
            }
        }
    }

    private void printSwimmable() {
        if (list.isEmpty()) {
            System.out.println("There Is No Swimmable Bird Available");
        } else {
            for (Bird bird : list) {
                if (bird instanceof Swimmable sBird) {
                    sBird.swim();
                }
            }
        }
    }

    private void printFlyable() {
        if (list.isEmpty()) {
            System.out.println("There Is No Flyable Bird Available");
        } else {
            for (Bird bird : list) {
                if (bird instanceof Flyable sBird) {
                    sBird.fly();
                }
            }
        }
    }

    void addNewSanctuary() {
        System.out.println("Enter Name Of New Sanctuary : ");
        String sanctuaryName = sc.nextLine().toUpperCase();
        if (map.containsKey(sanctuaryName)) {
            System.out.println("[" + sanctuaryName + "]->This Sanctuary Is Already Exists!");
        } else {
            list = new ArrayList<>();
            map.put(sanctuaryName, list);
            System.out.println("Sanctuary [" + sanctuaryName + "] Added Successfully!");
            operationInSanctuary();
        }
    }

    void printSanctuary() {
        System.out.println("Number Of Sanctuary : " + map.size() + "\n");
        if (map.isEmpty()) {
            System.out.println("There Is No Sanctuary Available");
        } else {
            for (Map.Entry<String, List<Bird>> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                System.out.println("[" + key + "]" + "->" + value + "\n");
            }
        }
    }

    void openSanctuary() {
        System.out.println("Sanctuary Name : " + map.keySet());
        if (map.isEmpty()) {
            System.out.println("There Is No Sanctuary Available");
        } else {
            System.out.println("Enter The Name Of Old Sanctuary You Want To Open : ");
            String addSanctuaryDetails = sc.nextLine().toUpperCase();
            if (map.containsKey(addSanctuaryDetails)) {
                list = map.get(addSanctuaryDetails);
                operationInSanctuary();
            } else {
                System.out.println("Sanctuary Doesn't Exists!");
            }
        }
    }

    private void updateGender(Bird bird) {
        System.out.print("1.MALE ");
        System.out.print(" 2.FEMALE ");
        System.out.print(" 3.OTHERS ");
        System.out.print(" 0.EXIT\n->");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                bird.setGender(Bird.Gender.MALE);
                break;
            case 2:
                bird.setGender(Bird.Gender.FEMALE);
                break;
            case 3:
                bird.setGender(Bird.Gender.OTHERS);
                break;
            case 0:
                return;
            default:
                System.out.println("Please Choose Valid Option!");
                break;
        }
    }

    private void operationInSanctuary() {
        boolean exit = true;
        while (exit) {
            System.out.print("1.Add Bird Details ");
            System.out.print(" 2.Update Bird Details ");
            System.out.print(" 3.Remove Bird Details ");
            System.out.print(" 4.Print Bird Details ");
            System.out.print(" 5.Print Swimmable ");
            System.out.print(" 6.Print Flyable ");
            System.out.print(" 0.exit\n->");

            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    addBirdDetails();
                    break;
                case 2:
                    updateBirdDetails();
                    break;
                case 3:
                    removeBirdDetails();
                    break;
                case 4:
                    printBirdDetails();
                    break;
                case 5:
                    printSwimmable();
                    break;
                case 6:
                    printFlyable();
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    System.out.println("Please Choose Valid Option! ");
                    break;
            }
        }
    }
}
