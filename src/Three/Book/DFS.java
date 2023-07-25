package Three.Book;

import java.util.ArrayList;

// 깊이 우선 탐색: DFS
public class DFS {
    public static boolean[] visited = new boolean[9];   // 방문 했는지 안했는지 확인하는 리스트
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();  // 그래프를 만들 ArrayList 변수 생성

    // dfs 메서드 정의
    public static void dfs(int x) {
        visited[x] = true;
        System.out.print(x + " ");

        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문함
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y])
                dfs(y);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++)
            graph.add(new ArrayList<>());

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);

        dfs(1);
    }
}
