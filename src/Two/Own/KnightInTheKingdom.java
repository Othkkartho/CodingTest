package Two.Own;

import java.util.Scanner;

// 왕실의 나이트: 8 x 8 좌표 평면상 왕실 정원에서 이동할 수 있는 경우의 수
public class KnightInTheKingdom {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String place = scanner.next();      // 나이트의 최초 위치 입력받기
        int x = place.charAt(0) - 'a' + 1;  // 나이트의 최조 x 위치 구하기
        int y = place.charAt(1) - '0';      // 나이트의 최초 y 위치 구하기

        int result = 0;

        // 나이트가 이동할 수 있는 8개의 x, y축을 배열에 저장
        int[][] dxy = {{-2, -1, 1, 2, -2, -1, 1, 2},
                {-1, -2, -2, -1, 1, 2, 2, 1}};

        // 말을 각 경우의 수에 맞게 이동시켜 좌표 평면상에서 벗어났는지 확인 후 벗어나지 않았다면 result 값을 1 증가시킴
        for (int i = 0; i < 8; i++) {
            int nx = x + dxy[0][i];
            int ny = y + dxy[1][i];

            if (nx < 1 || ny < 1 || nx > 8 || ny > 8)
                continue;

            result++;
        }

        System.out.println(result);
    }
}
