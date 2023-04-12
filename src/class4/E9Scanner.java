package class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you hungry enter true/false");
        boolean hungry=scanner.hasNextBoolean();
        if (hungry){
            System.out.println("lets order pizza");
        }else{
            System.out.println("lets practice java");
        }
    }
}
