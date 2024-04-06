public class LargestNumberTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] * 2 > max) {
                return -1;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        LargestNumberTwiceOfOthers obj = new LargestNumberTwiceOfOthers();
        System.out.println(obj.dominantIndex(new int[] { 3, 6, 1, 0 }));
        System.out.println(obj.dominantIndex(new int[] { 1, 2, 3, 4 }));
    }
}
