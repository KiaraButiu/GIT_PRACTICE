package Git1.kublitskyi;

import java.util.*;

public class kublitskyiFindDuplicate {

    //How to find duplicate characters in a string in Java?

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide any word");
        String input = scanner.next();
        System.out.println("Answer :");
        scanner.close();
        duplicateCharacters(input);
    }


    public static void duplicateCharacters (String input){
        Map<Character, Integer> map = new HashMap<>();
        String newInput = input.replace(" ", "");
        char[] array = newInput.toLowerCase().toCharArray();

        for(char eachChar: array){
            if(map.containsKey(eachChar)){
                map.put(eachChar, map.get(eachChar)+1);
            } else {
                map.put(eachChar, 1);
            }
        }
        Set<Character> allChars = map.keySet();

        for(Character eachChar: allChars){
            System.out.println(eachChar + " : " + map.get(eachChar));
        }
    }



}
