package Four.Book;

// 선택 정렬 소스코드: 가장 작은 데이터를 선택해 맨 앞의 데이터와 바꿈
public class selectionSort {
    public static void main(String[] args) {
        int n = 10;     // 숫자 배열의 길이
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8}; // 정렬할 숫자 배열

        for (int i = 0; i < n; i++) {
            int min_index = i;      // 가장 작은 원소의 인덱스

            for (int j = i+1; j < n; j++)
                if (arr[min_index] > arr[j])
                    min_index = j;

            // 정렬을 위한 스와프
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
