package class6;

import java.util.Scanner;

public class E3LogicalOperators {
    public static void main(String[] args) {
        boolean rich = true;
        boolean invitationFromRR = false;
        if (rich && invitationFromRR) {
            System.out.println("Yes you can buyRR");
        } else {
            System.out.println("You cant buy RR");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your height inches");
        int height = scanner.nextInt();
        System.out.println("height");
        if(height<60){
            System.out.println("Short");
        } else if (height <=60 && height<= 72) {
            System.out.println("Medium");
        } else {
            System.out.println("Tall");
        }
    }
}




