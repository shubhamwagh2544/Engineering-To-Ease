import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3, 4, 4, 5};
        int[] array2 = {2, 3, 4, 5, 5, 6, 6};

        int n1 = array1.length;
        int n2 = array2.length;

        //TC : O(n1 LogN + n2 logN) where logN is for insertion/lookup into hashset
        //SC : O(n1 + n2) where all elements are unique
        brute(array1, array2, n1, n2);

        //TC : O(n1 + n2)
        //SC : O(n1 + n2)
        better(array1, array2, n1, n2);
    }

    private static void better(int[] array1, int[] array2, int n1, int n2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                if (list.isEmpty() || list.get(list.size()-1) != array1[i]) {
                    list.add(array1[i]);
                }
                i++;
            }
            else {
                if (list.isEmpty() || list.get(list.size()-1) != array2[j]) {
                    list.add(array2[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (list.get(list.size()-1) != array1[i]) {
                list.add(array1[i]);
            }
            i++;
        }

        while (j < n1) {
            if (list.get(list.size()-1) != array2[j]) {
                list.add(array2[j]);
            }
            j++;
        }

        System.out.println(list);
    }

    private static void brute(int[] array1, int[] array2, int n1, int n2) {
        Set<Integer> set = new HashSet<>();

        for (int element : array1) {
            set.add(element);
        }

        for (int element : array2) {
            set.add(element);
        }

        System.out.println(set);
    }
}
