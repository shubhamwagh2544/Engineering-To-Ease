import java.util.Arrays;

public class RotateLeftByK {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;
        int k = 7;

        //TC : O(n + k)
        //SC : O(k)
        brute(array, n, k);

        //TC : O(n * k)
        //SC : O(1)
        better(array, n, k);

        //TC : O(n + k)
        //SC : O(1)
        optimal(array, n, k);
    }

    private static void optimal(int[] array, int n, int k) {
        k = k % n;
        reverse(0, k-1, array);
        reverse(k, n-1, array);

        reverse(0, n-1, array);

        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int first, int last, int[] array) {
        while (first < last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
    }

    private static void better(int[] array, int n, int k) {
        k = k % n;
        for (int i = 0; i < k; i++) {
            rotateLeftByOne(array, n);
        }

        System.out.println(Arrays.toString(array));
    }

    private static void rotateLeftByOne(int[] array, int n) {
        int temp = array[0];
        for (int i = 1; i < n; i++) {
            array[i-1] = array[i];
        }
        array[n-1] = temp;
    }

    private static void brute(int[] array, int n, int k) {
        k = k % n;
        int[] temp = new int[k];

        temp = Arrays.copyOfRange(array, 0, k);

        /*
        for (int i = 0; i < k; i++) {
            temp[i] = array[i];
        }
        */

        for(int i = k; i < n; i++) {
            if (i > 0) array[i-k] = array[i];
        }

        int i = 0;
        int index = n-k;
        while (index < n) {
            array[index++] = temp[i++];
        }

        System.out.println(Arrays.toString(array));
    }
}
