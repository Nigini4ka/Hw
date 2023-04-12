package Review2;

public class NestedIf {
    public static void main(String[] args) {
        // declare 2 variable for Driver L and car
       // if you have DL then i will check if you have car

        boolean DL=false;
        boolean car=true;
        if(DL){
            System.out.println("lets check if you have a car");
            if(car){
                System.out.println("you can drive to work");
            }else{
                System.out.println("you will need to take bus");
            }
        }else{
            System.out.println("you should get DL");
        }
    }
}
