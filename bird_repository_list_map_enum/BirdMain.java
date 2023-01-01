package bird_repository_list_map_enum;

import java.util.Scanner;

public class BirdMain {
    public static void main(String[] args) {
        BirdDetails birdDetails = new BirdDetails();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.print("1.Add New Sanctuary ");
            System.out.print(" 2.Print Sanctuary ");
            System.out.print(" 3.Open Old Sanctuary ");
            System.out.print(" 0.exit\n->");

            int options = sc.nextInt();

            switch (options) {
                case 1:
                    birdDetails.addNewSanctuary();
                    break;
                case 2:
                    birdDetails.printSanctuary();
                    break;
                case 3:
                    birdDetails.openSanctuary();
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    System.out.println("Please Choose Valid Option!");
            }
        }
    }
}
