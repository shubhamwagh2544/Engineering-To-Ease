import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3, 4, 5, 5};
        int[] array2 = {2, 3, 4, 5, 5, 6, 6};

        int n1 = array1.length;
        int n2 = array2.length;

        //TC : O(n1 * n2) or O(n1 * logN) where N = array2 size
        //SC : O(N + n2) where N = list size & n2 is visited array size
        brute(array1, array2, n1, n2);

        //TC : O(n1 + n2) worst case where two arrays are same
        //SC : O(n1 + n2)
        better(array1, array2, n1, n2);
    }

    private static void better(int[] array1, int[] array2, int n1, int n2) {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (array1[i] < array2[j]) {
                i++;
            }
            else if(array1[i] > array2[j]) {
                j++;
            }
            else {
                list.add(array1[i]);
                i++;
                j++;
            }
        }

        System.out.println(list);
    }

    private static void brute(int[] array1, int[] array2, int n1, int n2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < n1) {
            if (isPresentBS(array1[i], array2, 0, array2.length-1)) {
                list.add(array1[i]);
            }
            i++;
        }

        System.out.println(list);
    }

    private static boolean isPresent(int el, int[] array2) {
        boolean[] visited = new boolean[array2.length];

        for (int i = 0; i < array2.length; i++) {
            if (!visited[i] && array2[i] == el) {
                visited[i] = true;
                return true;
            }
        }

        return false;
    }

    private static boolean isPresentBS(int el, int[] array2, int low, int high) {
        boolean[] visited = new boolean[array2.length];
        if (low > high) {
            return false;
        }
        int mid = (low + high) / 2;
        if (!visited[mid] && array2[mid] == el) {
            visited[mid] = true;
            return true;
        }
        else if (el < array2[mid]) return isPresentBS(el, array2, low, mid-1);
        else return isPresentBS(el, array2, mid+1, high);
    }
}
