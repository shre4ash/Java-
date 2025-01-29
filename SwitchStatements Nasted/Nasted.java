import java.util.Scanner;


public class Nasted {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch  (empID) {
            case 1:
                System.out.println("Shreyash Kumbhar");
                break;
            case 2:
                System.out.println("Srahul rana");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("It departmnet");
                        break;
                    case "Mangement":
                        System.out.println("Mangement departmnet");
                        break;
                    default:
                        System.out.println("No department enterd");
                }
                break;
            default:
                System.out.println("Enter defult id");
        }
    }
}