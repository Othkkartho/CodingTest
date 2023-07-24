package Two.Own;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 문자열 재정렬: 알파벳 대문자와 숫자로만 구성된 문자열이 입력으로 주어질 때 모든 알파벳을 오름차순 정렬하고, 뒤에 모든 숫자를 더한 값을 이어 출력합니다.
public class StringResort {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();      // 문자열을 입력받습니다.
        ArrayList<Character> result = new ArrayList<>();    // 문자를 저장할 ArrayList를 만듭니다.
        int value = 0;  // 숫자를 더해 저장할 변수를 초기화합니다.

        // 입력받은 문자열을 char로 하나씩 꺼내 문자인지 확인한 뒤 문자면 리스트에 저장하고, 숫자면 value에 더합니다.
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                result.add(s.charAt(i));
            else
                value += s.charAt(i) - '0';
        }

        // 저장한 문자를 정렬합니다.
        Collections.sort(result);

        // 정렬한 문자를 차래대로 출력합니다.
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }

        // 마지막에 만약 더해진 값이 있다면 해당 내용을 뒤에 붙여 출력합니다.
        if (value != 0)
            System.out.print(value);
        System.out.println();
    }
}
