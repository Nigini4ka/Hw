package class9;

public class E7Arrays {
    public static void main(String[] args) {
        boolean[]flag={true,false,true,false,true,false};
        int counter=0;
        for (int i = 0; i < flag.length; i++) {
            if(!flag[i]){
             counter++;


            }

        }
        System.out.println(counter);
    }
}
