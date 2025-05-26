public class Solution {
    public static void rotateRight(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k >= n

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k >= n

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first n-k-1 elements
        reverse(nums, 0, n - k - 1);
        // Step 3: Reverse the remaining n-k to n-1 elements
        reverse(nums, n-k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for(int ele: arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        rotateLeft(arr, 3);

        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
