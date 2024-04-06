public class SwapPartOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        swap(arr, 1, 3);
        swap1(arr, 1, 3);
        swap2(arr, 1, 3);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void swap1(int[] arr, int i, int j) {
        int left = i;
        int right = j;
        for (int k = left; k < (left + right) / 2; k++) {
            arr[k] = arr[k] + arr[right - k + left];
            arr[right - k + left] = arr[k] - arr[right - k + left];
            arr[k] = arr[k] - arr[right - k + left];
        }
    }

    private static void swap2(int[] arr, int i, int j) {
        int left = i;
        int right = j;
        for (int k = left; k < (left + right) / 2; k++) {
            arr[k] = arr[k] ^ arr[right - k + left];
            arr[right - k + left] = arr[k] ^ arr[right - k + left];
            arr[k] = arr[k] ^ arr[right - k + left];
        }
    }
}
