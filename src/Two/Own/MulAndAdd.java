package Two.Own;

import Time.TimeSet;

import java.util.Scanner;

// 그리드: 곱하기 혹은 더하기 문제
public class MulAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        long start = TimeSet.timeStart();
        char[] c = S.toCharArray();

        int result = Character.getNumericValue(c[0]);

        for (int i = 1; i < c.length; i++) {
            int num = Character.getNumericValue(c[i]);

            if (result <= 1 || c[i] <= 1)
                result += num;
            else
                result *= num;
        }

        System.out.println(result);
        TimeSet.timeEnd(start);
    }
}
