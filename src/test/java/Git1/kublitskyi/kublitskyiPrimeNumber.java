package Git1.kublitskyi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class kublitskyiPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        while (input < 2) {
            System.out.println("Provide any positive number");
            try {
                input = scanner.nextInt();
                if (input <= 1) {
                    throw new IllegalArgumentException("Input cannot be negative,null or one");
                }
                System.out.println("Prime numbers between 1 and " + input + " : ");
            } catch (InputMismatchException e) {
               System.err.println("Error: Input MUST be a number");
               scanner.next();
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
        scanner.close();


        for(int i = 2; i<= input; i++){
            if(primeChecker(i)){
                System.out.print(i + " ");
            }
        }


    }

    public static boolean primeChecker(int input) {
        for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
