package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();
        while (num!=-1) {
            System.out.print("try again ");
            num=scanner.nextInt();
    }}
}
