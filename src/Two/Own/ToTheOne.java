package Two.Own;

import java.util.Scanner;

public class ToTheOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(), k = scanner.nextInt();
        int count = 0;

        while (n != 1) {
            if (n % k != 0) {
                --n;
            } else {
                n /= k;
            }
            ++count;
        }

        System.out.println(count);
    }
}
