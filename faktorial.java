import java.util.*;
import java.lang.Math;

public class faktorial {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int intpost, result;

        intpost = Integer.parseInt(input.nextLine());
        result = factorial(intpost);
        System.out.println(result);
    }
    
    public static int factorial(int int1) {
        int result;

        if (int1 == 0) {
            result = 1;
        } else {
            result = int1 * factorial(int1 - 1);
        }
        
        return result;
    }
}
