package Three.Own;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class Maze {
    public static int n, m;     // x, y축
    public static int[][] maze = new int[200][200]; // 미로

    public static int dxy[][] = {{-1, 1, 0, 0}, {0, 0, -1, 1}}; // 상, 하, 좌, 우 우치 배열

    //bfs는 Queue를 사용했기 때문에 Queue에 값을 넣고, 마지막 탈출 위치까지 1씩 더해 다시 저장한다. 그리고 탈출 위치의 값을 반환한다.
    public static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dxy[0][i];
                int ny = y + dxy[1][i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                    continue;
                if (maze[nx][ny] == 0)
                    continue;
                if (maze[nx][ny] == 1) {
                    maze[nx][ny] = maze[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        return maze[n-1][m-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt(); m = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < m; j++)
                maze[i][j] = str.charAt(j) - '0';
        }

        System.out.println(bfs(0, 0));
    }
}
