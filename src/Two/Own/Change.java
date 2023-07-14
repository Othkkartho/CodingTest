package Two.Own;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coinList = {500, 100, 50, 10};
        int money = scanner.nextInt();

        int count = 0;

        for (int coin : coinList) {
            count += money / coin;
            money %= coin;
        }

        System.out.println(count);
    }
}