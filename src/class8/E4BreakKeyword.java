package class8;

public class E4BreakKeyword {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<50;i++){
            sum=sum+i;
            if(i>300){
                break;
            }
            System.out.println(i);
        }
    }
}
