package Two.Own;

import java.util.Scanner;

// 0:0:0 ~ N:59:59 모든 시각 중 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램 
public class Clock {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();      //시각인 N 입력 받기 (0 <= N <= 23)

        int result = 0;                 // 모든 경우의 수를 샌 값
        String time = "";               // 몇 시인지 저장할 변수 선언

        for (int i = 0; i <= n; i++) {          // 시
            for (int j = 0; j < 60; j++) {      // 분
                for (int k = 0; k < 60; k++) {  // 초
                    time = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);   // 몇시인지 String으로 저장

                    if (time.contains("3"))     // contains를 통해 3이 string에 3이 들어있는지 확인하고 있다면 result를 1 증가시킴
                        result++;
                }
            }
        }

        System.out.println(result); // 결과 출력
    }
}
