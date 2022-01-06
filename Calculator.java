import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        int a,b;
        String c;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number for the value of a");
        a = in.nextInt();

        System.out.println("Please enter a number for the value of b");
        b = in.nextInt();

        System.out.println("Enter mathematical operation to perform between +, - , *, /");
        c = in.next();

        performOperation(a,b,c);

    }

    private static void performOperation(int a, int b, String c) {
        Operaions operaions = new Operaions();
        switch (c)
        {
            case "+":
                System.out.println(operaions.addition(a,b));
                break;
            case "-":
                System.out.println(operaions.subtraction(a,b));
                break;
            case "*":
                System.out.println(operaions.multiplecation(a,b));
                break;
            case "/":
                try {
                    System.out.println(operaions.division(a,b));
                }catch (ArithmeticException arithmeticException)
                {
                    System.out.println("b must be above 0 to avoid Arithmetic Exception");;
                }

                break;
            default:
                System.out.println("Please enter the following symbols +, - , *, /");

        }
    }

}
