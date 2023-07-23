package Two.Own;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 모험가 길드 문제 해결
public class Guild {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();                      // 모험가의 수(1 <= N <= 100,000)를 입력받는다.
        ArrayList<Integer> fears = new ArrayList<>();   // 모험가의 공포도 값을 저장할 ArrayList 생성

        for (int i = 0; i < n; i++)         // 만든 리스트에 N 이하의 자연수를 입력받습니다.
            fears.add(scanner.nextInt());

        Collections.sort(fears);            // 최대 그룹을 확인하기 위해 리스트를 오름차순 정렬시킵니다.

        int group = 0;      // 생성된 그룹의 수

        int count = 0;      // 해당 인원 수
        for (int fear : fears) {    // 자바 8부터 나온 람다를 통해 리스트 안의 값들을 하나씩 꺼내며 값을 비교
            if (++count >= fear) {  // 꺼낸 공포도가 인원수보다 작거나 같으면 그룹을 생성한다.
                group++;
                count = 0;
            }
        }

        System.out.println(group);  // 여행을 떠날 수 있는 그룹 수의 최댓값을 출력합니다.
    }
}
