public class SmallestElement {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 5, 1, 3, 5};
        int n = array.length;

        //TC : O(N)
        //SC : O(1)
        optimal(array, n);
    }

    private static void optimal(int[] array, int n) {
        int min = 100000;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println(min);
    }
}
