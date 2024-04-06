import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        //int[] array = {3, 2 ,4};                //array may not be sorted
        int n = array.length;
        int target = 9;

        //TC : O(n^2)
        //SC : O(1)
        brute(array, n, target);

        //TC : O(n) * O(n) where O(n) is worst case for contains method
        //SC : O(n) where n = list size
        better(array, n, target);

        //TC : O(n)
        //SC : O(n) where n is map size
        betterAnother(array, n, target);

        //TC : O(n)
        //SC : O(1)
        optimal(array, n, target);          // only if array is sorted : two pointer approach
    }

    private static void optimal(int[] array, int n, int target) {
        int start = 0;
        int end = n-1;
        int[] ans = new int[2];

        while (start < end) {
            if ((array[start] + array[end]) > target) {
                end--;
            }
            else if ((array[start] + array[end]) < target) {
                start++;
            }
            else {
                ans[0] = start;
                ans[1] = end;
                break;
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    private static void betterAnother(int[] array, int n, int target) {
        //map
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            if (map.containsKey(target-array[i])) {
                ans[0] = i;
                ans[1] = map.get(target-array[i]);
            }
            else {
                map.put(array[i], i);
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    private static void better(int[] array, int n, int target) {
        //list
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            if (list.contains(target - array[i])) {
                ans[0] = i;
                ans[1] = list.indexOf(target - array[i]);
            }
            else {
                list.add(array[i]);
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    private static void brute(int[] array, int n, int target) {
        int[] ans = new int[2];

        outer: for (int i = 0; i < n-1; i++) {
             for (int j = i+1; j < n; j++) {
                if (array[i]+array[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break outer;
                }
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
