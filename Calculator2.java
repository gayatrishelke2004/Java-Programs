import java.util.Scanner;
public class Calculator2
{
    public static void main(String[] args)
    {
        System.out.println("Calculator:");
        System.out.println("Enter 1st Number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd Number:");
        int num2 = scanner.nextInt();
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println("Addition is:"+addition);
        System.out.println("Substraction is:"+substraction);
        System.out.println("Multiplication is:"+multiplication);
        System.out.println("Division is:"+division);
    }
}
