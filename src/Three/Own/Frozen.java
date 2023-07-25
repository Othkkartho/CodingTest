package Three.Own;

import java.util.Scanner;

// 음료수 얼려 먹기: 0으로 연결된 틀 모양으로 아이스크림이 만들어집니다.
public class Frozen {
    public static int n, m;     // 얼음판의 가로 세로
    public static int[][] plat = new int[1000][1000];   // 얼음판

    // 해당 노드 주변에 얼음을 얼릴 수 있는지 dfs를 이용해 확인
    public static boolean dfs(int x, int y) {
        if (x <= -1 || y <= -1 || x >= n || y >= m) // 판의 범위를 넘어가면 종료
            return false;

        // 얼음이 들어갈 수 있다면 주변에도 얼음이 들어갈 수 있는지 확인
        if (plat[x][y] == 0) {
            plat[x][y] = 1;     // 얼음 방문처리

            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt(); m = scanner.nextInt();
        scanner.nextLine();

        // 한줄로 받은 얼음판을 int로 다시 저장
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                plat[i][j] = str.charAt(j) - '0';
            }
        }

        // dfs를 호출해 얼음을 만들 수 있으면 result의 값을 올린다.
        int result = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (dfs(i, j))
                    result++;

        System.out.println(result);
    }
}
