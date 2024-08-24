package Git1.kublitskyi;

import java.util.Arrays;

public class kublitskyiAnagram {

    public static void main(String[] args) {

        String firstString = "Mother In Law";
        String secondString = "Hitler Woman";

        String firstStringNotAnagramPair = "joy";
        String secondStringNotAnagramPair = "enjoy";

        anagramChecker(firstString, secondString);
        anagramChecker(firstStringNotAnagramPair, secondStringNotAnagramPair);
    }

    public static boolean anagramChecker( String string1, String string2){
        String newString1 = string1.replaceAll(" ", "");
        String newString2 = string2.replaceAll(" ", "");

        boolean status = true;

        if(newString1.length() != newString2.length()){
            status = false;
        } else {
            char[] newString1Array = newString1.toLowerCase().toCharArray();
            char[] newString2Array = newString2.toLowerCase().toCharArray();

            Arrays.sort(newString1Array);
            Arrays.sort(newString2Array);

            status = Arrays.equals(newString1Array, newString2Array);
        }

        if(status){
            System.out.println("\"" + string1 + "\"" + " and " + "\"" + string2 + "\"" + " are anagrams");
        } else {
            System.out.println("\"" + string1 + "\"" + " and " + "\"" + string2 + "\"" + " are NOT anagrams");
        }

        return status;
    }
}
