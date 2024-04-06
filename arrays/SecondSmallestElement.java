import java.util.Arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] array = {6, 4, 7, 1, 7, 7, 2, 5, 6, 5};
        int n = array.length;

        //TC : O(NlogN)
        //SC : O(N) or O(logN)
        brute(array);    //no duplicates

        //TC : O(n)
        //SC : O(1)
        better(array, n);   //no duplicates + modifies the input array

        //TC : O(n)
        //SC : O(1)
        better2(array);

        //TC : O(n)
        //SC : O(1)
        optimal(array, n);
    }

    private static void optimal(int[] array, int n) {
        int min = 10000;
        int secondMin = 10000;

        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            }

            if (array[i] < secondMin && array[i] != min) {
                secondMin = array[i];
            }
        }

        System.out.println(secondMin);
    }

    private static void better2(int[] array) {
        int min = 10000;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        int secondMin = 10000;
        for (int element : array) {
            if (element < secondMin && element != min) {
                secondMin = element;
            }
        }

        System.out.println(secondMin);
    }

    private static void better(int[] array, int n) {
        int min = 10000;
        int minIndex = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        array[minIndex] = 10000;

        int secondMin = 10000;
        for (int element : array) {
            if (element < secondMin) {
                secondMin = element;
            }
        }

        System.out.println(secondMin);
    }

    private static void brute(int[] array) {
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
