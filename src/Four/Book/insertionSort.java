package Four.Book;

// 삽입정렬 코드:선택 정렬에 비해 구현 난이도가 높지만 일반적으로 더 효율적으로 동작한다.
public class insertionSort {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                // 정렬을 위해 비교한 arr 앞에 값을 넣는다.
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
