public class quiz1 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);
        
        swap(a, b);     // pass by value
        
        System.out.println(a + " " + b);
        
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        
        System.out.println(arr[0] + " " + arr[1]);
        
        swapArray(arr);
        
        System.out.println(arr[0] + " " + arr[1]);
    }
    
    static void swap(int a, int b) {    // variables of two functions are not connected
        int temp = a;
        a = b;
        b = temp;
    }
    
    static void swapArray(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}