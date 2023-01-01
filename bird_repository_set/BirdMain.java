package bird_repository_set;

import java.util.Scanner;

public class BirdMain {
    public static void main(String[] args) {
        BirdDetails birdDetails = new BirdDetails();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.print("1.Add Bird Details ");
            System.out.print(" 2.Edit Bird Details ");
            System.out.print(" 3.Delete Bird Details ");
            System.out.print(" 4.Show Bird Details ");
            System.out.print(" 5.Display Swimmable ");
            System.out.print(" 6.Display Flyable ");
            System.out.print(" 0.exit\n->");

            int options = sc.nextInt();

            switch (options) {
                case 1:
                    birdDetails.addDetails();
                    break;
                case 2:
                    birdDetails.editDetails();
                    break;
                case 3:
                    birdDetails.deleteDetails();
                    break;
                case 4:
                    birdDetails.showDetails();
                    break;
                case 5:
                    birdDetails.displaySwim();
                    break;
                case 6:
                    birdDetails.displayFly();
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
