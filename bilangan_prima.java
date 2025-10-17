// 12S25026 - Andre Bonaran Situngkir
// 12S25029 - Theressia Olivia Simanjuntak
import java.util.*;
import java.lang.Math;

public class bilangan_prima {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;

        n = Integer.parseInt(input.nextLine());
        for (i = 2; i <= n; i++) {
            if (isPrima[i]) {
                System.out.print(Integer.toString(i) + " ");
            }
        }
    }
    
    public static boolean isPrima(int x) {
        int i;
        boolean returnValue;

        if (x <= 1) {
            returnValue = false;
        } else {
            returnValue = true;
        }
        
        return returnValue;
    }
}
