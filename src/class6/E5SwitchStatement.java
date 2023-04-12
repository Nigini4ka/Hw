package class6;

public class E5SwitchStatement {
    public static void main(String[] args) {
        char gender='F';
        switch(gender) {
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("male");
                break;
            case 0:
                System.out.println("other");
                break;
            default:
                System.out.println("char not supported");
        }
    }
}
