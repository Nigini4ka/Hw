package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        int num=100;
        while(num>1){
            System.out.print(num+" ");
            num--;
        }

        int count=20;
        System.out.println();
        while(count<=100){
            System.out.print(count+" ");
            count+=2;
        }
       int counter=100;
        System.out.println();
        while(counter>=1){
            if(counter%2==1){
                System.out.print(counter+" ");
            }
            counter--;
        }
    }
}
