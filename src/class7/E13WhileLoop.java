package class7;

import java.util.Scanner;
//ask the user for a number than print all the number from 1 to that num
public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter any number greater than 1");
        int lastNumber=scanner.nextInt();

        int counter=1;
        while(counter<=lastNumber){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
