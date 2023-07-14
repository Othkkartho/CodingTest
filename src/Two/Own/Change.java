package Two.Own;

import java.util.Scanner;

// 그리드: 거스름돈 문제
public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coinList = {500, 100, 50, 10};
        int money = scanner.nextInt();

        long start = TimeSet.timeStart();

        int count = 0;

        for (int coin : coinList) {
            count += money / coin;
            money %= coin;
        }

        System.out.println(count);
        TimeSet.timeEnd(start);
    }
}