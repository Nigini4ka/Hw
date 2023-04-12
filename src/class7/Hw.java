package class7;

import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1-7");

        int day= scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");

            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("Invalid");
        }
        int num=3;
        for (int i = 1; i <10 ; i++) {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }}








