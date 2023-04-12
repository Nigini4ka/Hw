package Review2;

public class IfElse {
    public static void main(String[] args) {
        int age=18;
        if(age>=18){
            System.out.println("you can get DR");
        } else {
            System.out.println("You too young to drive");
        }

        String expected="Best sellers";

        if(expected.equals("Best Sellers")){
            System.out.println("test passes");
        }else {
            System.out.println("test fail");
        }

        int worldCup=2014;
        if(worldCup==2022){
            System.out.println("country is qatar");
        }else if(worldCup==2018){
            System.out.println("country is russia");
        }else if(worldCup==2014){
            System.out.println("contry is brazil");
        }else{
            System.out.println("country is unknown");
        }

    }
}
