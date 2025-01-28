import java.util.Scanner;

public class Calculater{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

       int ans = 0;

        while (true)  {
             System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if  (op == '*' || op == '-' || op == '*' || op =='/' || op == '%') {
                // input two numbers
                 System.out.print("Enter two number: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '*') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                    ans = num1 / num2;
                }
                }
                if (op =='%') {
                    ans = num1 % num2;
                }
            } else if(op == 'x' || op == 'x'){
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
        }
       System.out.println(ans);
    }
}