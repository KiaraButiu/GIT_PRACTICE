package Git1.kublitskyi;

import java.util.Scanner;

public class kublitskyiCountYZ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print any string");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println("Answer:");
        System.out.println(numberOfEndings(input));
    }

    public static int numberOfEndings(String input){
        String[] inputArray = input.split(" ");
        int counter=0;
        for (String eachString : inputArray) {
            int lastSymbol = eachString.length()-1;
            char[] each = eachString.toLowerCase().toCharArray();
            if(each[lastSymbol]=='y' || each[lastSymbol]=='z'){
                counter+=1;
            }

        }
        return counter;
    }
}
