package Four.Book;

// 계수정렬 코드: 데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때만 사용할 수 있지만 매우 빠르게 동작하는 정렬 알고리즘
public class countingSort {
    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int n = 15;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] cnt = new int[MAX_VALUE + 1];

        for (int i = 0; i < n; i++)
            cnt[arr[i]] += 1;

        for (int i = 0; i <= MAX_VALUE; i++)
            for (int j = 0; j < cnt[i]; j++)
                System.out.print(i + " ");
    }
}
