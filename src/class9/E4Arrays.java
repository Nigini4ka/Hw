package class9;

public class E4Arrays {
    public static void main(String[] args) {
       String [] names={"nik","sik","sik","pik","tik"};
        for (int i = 2; i <names.length; i++) {
            System.out.print(names[i]+" ");

            System.out.println();
            for (int j= 0; j <names.length-1; j++) {
                System.out.print(names[j]+" ");
        }
            System.out.println();
            int counter=0;
            while(counter< names.length){
                System.out.print(names[counter]+" ");
                counter++;
            }

    }
}}
