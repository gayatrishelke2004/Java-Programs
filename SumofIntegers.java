import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values separated by space:");
        String input = scanner.nextLine();
        Scanner tokenizer = new Scanner(input);

        while (tokenizer.hasNext()) {
            n = tokenizer.nextInt();
            sum = sum + n;
        }

        System.out.println("Sum of the integers is: " + sum);
        scanner.close();
        tokenizer.close();
    }
}
