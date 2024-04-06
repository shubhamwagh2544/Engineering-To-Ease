import java.util.Stack;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] array = {10, 22, 12, 3, 0, 6};                //Sol : 22 12 6
        int n = array.length-1;

        printLeadersIterative(array, n);
        
        printLeadersRecursive(array, n, -1);

        printLeadersUsingStack(array, n);
    }

    private static void printLeadersUsingStack(int[] array, int n) {
        int max = -1;
        Stack<Integer> stack = new Stack<>();

        while (n >= 0) {
            if (array[n] > max) {
                stack.push(array[n]);
                max = array[n];
            }
            n--;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static void printLeadersIterative(int[] array, int n) {
        int max = -1;

        while (n >= 0) {
            if (array[n] > max) {
                System.out.println(array[n]);
                max = array[n];
            }
            n--;
        }
    }

    private static void printLeadersRecursive(int[] array, int n, int max) {
        if (n == 0) {
            return;
        }
        if (array[n] > max) {
            System.out.println(array[n]);
            max = array[n];
        }
        printLeadersRecursive(array, n-1, max);
    }
}
