package class8;

public class E3ForLoop {
    public static void main(String[] args) {
       //write the loop to add all the odd num from 1 to 10

        int sum=0;
        for(int l=1;l<10;l++){
            if(l%2==0){
                sum=sum+l;
            }

        }
        System.out.println(sum);
    }

}
