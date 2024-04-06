public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        reverse(arr);
        //reverse2(arr);
        //reverse3(arr);
        //reverse4(arr);
        //reverse5(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {   // swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse2(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {  // swap the elements
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void reverse3(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {  // copy the array in reverse order
            temp[i] = arr[arr.length - 1 - i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void reverse4(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {  
            arr[i] = arr[i] + arr[arr.length - 1 - i];  // a = a + b
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i]; // b = a - b
            arr[i] = arr[i] - arr[arr.length - 1 - i];  // a = a - b
        }
    }

    public static void reverse5(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            arr[i] = arr[i] ^ arr[n - 1 - i];  // a = a ^ b
            arr[n - 1 - i] = arr[i] ^ arr[n - 1 - i]; // b = a ^ b ^ b = a
            arr[i] = arr[i] ^ arr[n - 1 - i];  // a = a ^ b ^ a = b
        }
    }
}
