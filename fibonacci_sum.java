import java.util.*;
import java.lang.Math;

public class fibonnacci_sum {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, temp, sum, bil1, bil2, i;

        bil1 = 0;
        bil2 = 1;
        sum = 0;
        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            sum = sum + bil2;
            temp = bil2;
            bil2 = bil1 + bil2;
            bil1 = temp;
        }
        System.out.println(sum);
    }
}
