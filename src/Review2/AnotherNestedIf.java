package Review2;

public class AnotherNestedIf {
    public static void main(String[] args) {
        //if you have a covid vaccine or not
        //if dose=1->you need to fully vaccinated

        boolean vacine=true;
        int dose=1;
        if(vacine) {
            System.out.println("you  need second dose");

        }else if(dose==2){
            System.out.println("you are fully vaccinated");
        }else if(dose==3){
            System.out.println("you fully vaccinated with booster");
        }
    }
}
