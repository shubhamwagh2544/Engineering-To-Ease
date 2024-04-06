import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 4, 2};          //each element appears twice except one single element
        int n = array.length;

        //TC : O(n) + O(m) where m is hashmap size
        //SC : O(m)
        brute(array, n);

        //TC : O(n * n)
        //SC : O(1)
        bruteAnother(array, n);

        //TC : O(n + n)
        //SC : O(max + 1) where max is max element of array
        better(array, n);

        //TC : O(N + NLogN)
        //SC : O(1)
        betterAnother(array, n);

        //TC : O(N)
        //SC : O(1)
        optimal(array, n);
    }

    private static void optimal(int[] array, int n) {
        //XOR of two same numbers is zero
        //XOR of number and zero is number itself

        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= array[i];
        }

        System.out.println(res);
    }

    private static void betterAnother(int[] array, int n) {
        //sorting
        Arrays.sort(array);

        for (int i = 0; i < n-2; i+=2) {
            if (array[i] != array[i+1]) {
                System.out.println(array[i]);
                return;
            }
        }
        //else last element is single
        System.out.println(array[n-1]);
    }

    private static void better(int[] array, int n) {
        int max = -1;
        for (int element : array) {
            max = Math.max(max, element);
        }

        int[] space = new int[max+1];

        for (int i = 0; i < n; i++) {
            space[array[i]]++;
        }

        for (int i = 0; i < space.length; i++) {
            if (space[i] == 1) {
                System.out.println(i);
                return;
            }
        }
    }

    private static void bruteAnother(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (flag) break;
                if (i != j && array[i] == array[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(array[i]);
                return;
            }
        }
    }

    private static void brute(int[] array, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int element : array) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            }
            else {
                map.put(element, map.get(element) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}
