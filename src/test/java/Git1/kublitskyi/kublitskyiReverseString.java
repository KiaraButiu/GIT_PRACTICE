package Git1.kublitskyi;

import java.util.Scanner;

public class kublitskyiReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide any word");
        String input = scanner.next();
        scanner.close();
        System.out.println("Answer with StringBuilder v1: " + reverseStringStringBuilder(input));
        System.out.println("Answer with StringBuilder v2: " + reverseStringBuilder(input));
        System.out.println("Answer with toCharArray(): " + reverseString(input));


    }

    public static String reverseStringStringBuilder(String input){
        StringBuilder reverseWord = new StringBuilder();
        for (int i = input.toCharArray().length -1; i>=0; i--){
            reverseWord = reverseWord.append(input.toCharArray()[i]);
        }
        return String.valueOf(reverseWord);
    }

    public static String reverseStringBuilder(String input){
        String reverseWord = new StringBuilder(input).reverse().toString();
        return reverseWord;
    }

    public static String reverseString(String input){
        String reverseWord = "";
        for(int i = input.toCharArray().length-1; i >=0; i--){
            reverseWord+=input.toCharArray()[i];
        }
        return reverseWord;
    }
}
