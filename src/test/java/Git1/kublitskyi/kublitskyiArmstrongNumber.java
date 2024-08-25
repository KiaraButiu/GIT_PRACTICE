package Git1.kublitskyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class kublitskyiArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide any number positive number or 0");
        int input = -1;

        while (input < 0){
            try {
                input = scanner.nextInt();
                if(input < 0 ){
                    throw new NumberFormatException("Number cannot be negative");
                }
                System.out.println("You entered this number: " + input);

                System.out.println("Is this number Armstrong?: " + armstrongChecker(input));

            } catch (IllegalArgumentException e){
                System.err.println("Error: Negative numbers are not accepted. Please provide a positive integer.");
            }
        }
        scanner.close();
    }



    public static boolean armstrongChecker(int input){
        boolean status = false;
        int copyOfNum = input;
        int numberOfDigits = String.valueOf(copyOfNum).length();
        int sum = 0;
        int counter = 0;

        List<Integer> digits = new ArrayList<>();

        while (copyOfNum > 0){
            digits.add(0, copyOfNum %10);
            copyOfNum/= 10;
        }

        for (Integer digit : digits) {
            counter = (int) Math.pow(digit, numberOfDigits);
            sum+=counter;
        }

        if(input==sum){
            return status = true;
        } else {
            return status;
        }
    }
}
