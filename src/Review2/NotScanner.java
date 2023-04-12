package Review2;

import java.util.Scanner;

public class NotScanner {
    public static void main(String[] args) {
        int i=10;
        Scanner key=new Scanner(System.in);
        System.out.println("please enter full sentence");
        String sentence=key.nextLine();
        System.out.println(sentence);
        System.out.println("please enter 1 world");
        String word=key.next();
        System.out.println("world that was captured="+ word);

        System.out.println("please enter integer value");
        int number=key.nextInt();
        System.out.println("entered number is=" +number);

        System.out.println("please enter decimal value");
      double decimal=key.nextDouble();
        System.out.println("Decimal value="+decimal);



    }
}
