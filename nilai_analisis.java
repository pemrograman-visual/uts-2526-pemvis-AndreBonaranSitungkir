import java.util.*;
import java.lang.Math;

public class nilai_analasis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double jumlah, max, min, ratarata;
        int i, n;

        n = Integer.parseInt(input.nextLine());
        double[] ns = new double[4];

        jumlah = 0;
        for (i = 0; i <= 3; i++) {
            ns[i] = Double.parseDouble(input.nextLine());
            jumlah = jumlah + ns[i];
        }
        ratarata = jumlah / 4;
        max = ns[0];
        for (i = 0; i <= 3; i++) {
            if (ns[i] > max) {
                max = ns[i];
            }
        }
        min = ns[0];
        for (i = 0; i <= 3; i++) {
            if (ns[i] < min) {
                min = ns[i];
            }
        }
        System.out.println("avg=" + ratarata);
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }
}
