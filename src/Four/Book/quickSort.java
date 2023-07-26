package Four.Book;

// 퀵정렬 코드: 기준 데이터를 설정하고 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸는 정렬
public class quickSort {
    public static void quicksort(int[] arr, int start, int end) {
        // 원소가 1개인 경우 종료
        if (start >= end)
            return;
        int pivot = start;
        int left = start + 1;
        int right = end;
        // 피벗보다 크거나 작은 데이터를 찾을 때 까지 반복
        while (left <= right) {
            while (left <= end && arr[left] <= arr[pivot])
                left++;
            while (right > start && arr[right] >= arr[pivot])
                right--;
            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
        quicksort(arr, start, right - 1);
        quicksort(arr, right + 1, end);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quicksort(arr, 0, n - 1);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}