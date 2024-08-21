package Git1.kublitskyi;

public class kublitskyiClass4 {

    public static void main(String[] args) {

    }

    public static int factorialCalculator (int number){
        int result = 1;
        if (number >= 1) {
            for (int i = number; i > 0; i--) {
                result *= number;
            }
        } else if (number < 0) {
            System.err.println("Incorrect input");
        }

        return result;
    }
}
