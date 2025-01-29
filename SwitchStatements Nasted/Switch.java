import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        if (fruit.equals("mango")) {
//            System.out.println("King  of friuts");
//        }
//
//        if (fruit.equals("apple")) {
//            System.out.println("a sweet red fruit");
//        }

//        switch (fruit) {
//            case "mango":
//                System.out.println("King of fruits");
//
//
//            case "apple":
//                System.out.println("A sweet red fruit");
//                break;
//
//            case "orange":
//                System.out.println("Round fruit");
//                break;
//
//                case "Grapes":
//                System.out.println("A sweet red fruit");
//                break;
//
//            default:
//                System.out.println("Nothiong");
//        }

//        switch (fruit){
//            case "mango" -> System.out.println("King of fruit");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Graphes" -> System.out.println("samall fruit");
//           default -> System.out.println("Please enter a valid Fruit");
//        }

        int day = in.nextInt();
        switch (day) {
            case  1 -> System.out.println("Monday");
            case  2 -> System.out.println("Tuesday");
            case  3 -> System.out.println("Wensday");
            case  4 -> System.out.println("Thursday");
            case  5 -> System.out.println("Friday");
            case  6 -> System.out.println("Saturday");
            case  7 -> System.out.println("Sunday");
        }
    }
}