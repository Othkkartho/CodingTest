package Two.Own;

import Time.TimeSet;

import java.util.Scanner;

// 그리드: 1이 될 때까지 문제
public class ToTheOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(), k = scanner.nextInt();
        int count = 0;

        long start = TimeSet.timeStart();

        while (n != 1) {
            if (n % k != 0) {
                --n;
            } else {
                n /= k;
            }
            ++count;
        }

        System.out.println(count);

        TimeSet.timeEnd(start);
    }
}
