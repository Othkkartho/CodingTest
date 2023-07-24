package Two.Own;

import java.util.Scanner;

// 상하좌우로 이동하는 문제
public class UDLR {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // 정사각형 공간 크기
        scanner.nextLine();         // Enter로 인한 scanner 버퍼 비우기
        String[] plans = scanner.nextLine().split(" "); // 여행가의 여행 계획서 입력
        int x = 1; int y = 1;       // 시작값 초기화(문제에서 1, 1에서 시작해서 1, 1로 초기화)

        int[][] dxy = {{-1, 1, 0, 0}, {0, 0, 1, -1}};   // 각 이동 거리를 배열로 작성
        String[] moves = {"U", "D", "R", "L"};          // 위 이동 거리에 맞는 움직임 작성

        for (String plan : plans) {             // 여행 계획서에서 1개씩 뽑아 반복문 실행
            int nx = -1; int ny = -1;

            for (int i = 0; i < 4; i++) {       // 어떤 이동인지 확인하기 위해 move 배열을 찾아봄
                if (plan.equals(moves[i])) {    // move 배열에서 맞는 움직임을 찾으면 그와 관련된 거리를 이동
                    nx = x + dxy[0][i];
                    ny = y + dxy[1][i];
                }
            }
            if (nx < 1 || ny < 1 || nx > n || ny > n)   // 만약 공간을 넘어 이동하면 움직임을 무시함
                continue;

            x = nx;     // 만약 정상적으로 움직였다면 해당 값을 x, y에 저장해 움직임을 반영함
            y = ny;
        }

        System.out.println(x + " " + y);    // 움직임 출력
    }
}
