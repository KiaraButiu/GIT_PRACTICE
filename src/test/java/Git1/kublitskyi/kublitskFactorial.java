package Git1.kublitskyi;

import java.util.Scanner;

public class kublitskFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your digit:");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Answer: ");
        System.out.println(factorialCalculator(number));

    }

    public static int factorialCalculator (int number){
        int result = 1;
        if (number >= 1) {
            for (int i = number; i > 0; i--) {
                result = result * i;
            }
        } else if (number < 0) {
            throw new NumberFormatException("Factorial cannot be negative");

        }
        return result;
    }
}
