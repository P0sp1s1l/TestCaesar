
import java.util.Scanner;


public class Test {
    public static Scanner sc = new Scanner(System.in);

    public static int key (int x) {
        int a = 345;
        int fce = (a + 13 * x) % 27;
        return fce;
    }

    public static void encryption (char[] encrypt) {
        for (int i = 0; i < encrypt.length; i++) {
            encrypt[i] = (char) (encrypt[i] + key(5));

            if (encrypt[i] > 122) {
                encrypt[i] = (char) (encrypt[i] - 26);

            }

            System.out.println(encrypt[i]);
        }
    }

}
