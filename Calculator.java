import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("Basic Calculator");
        System.out.println("Enter First Number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter the Operator:/ * + -");
        char operator = scanner.next().charAt(0);
        int result =0;
        switch (operator)
        {
            case '+':
                result=num1+num2;
                break;

            case '-':
                result=num1-num2;
                break;

            case '*':
                result=num1*num2;
                break;

            case '/':
                result=num1/num2;
                break;

            default:
                System.out.println("Invalid Input");
        }
        System.out.println("Result is:"+result);
    }


}
