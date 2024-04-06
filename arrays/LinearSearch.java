public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 2, 5};

        int target = 4;
        linearSearch(array, target);
    }

    private static void linearSearch(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }
}
