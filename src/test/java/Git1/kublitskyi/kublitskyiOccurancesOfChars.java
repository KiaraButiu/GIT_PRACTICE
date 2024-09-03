package Git1.kublitskyi;

import java.util.ArrayList;
import java.util.HashMap;

public class kublitskyiOccurancesOfChars {

    //How to count occurrences of each character in a string in Java?
    public static void main(String[] args) {
        String input = "Java J2EE Java JSP J2EE";
        occurrencesChecker(input);
    }

    public static void occurrencesChecker(String input) {
        HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
        String newInput = input.toLowerCase().replace(" ", "");
        char[] array = newInput.toCharArray();

        for (char eachChar : array) {
            if (counter.containsKey(eachChar)){
                counter.put(eachChar, counter.get(eachChar)+1);
            } else {
                counter.put(eachChar, 1);
            }
        }
        System.out.println(input + " : " + counter);
    }
}
