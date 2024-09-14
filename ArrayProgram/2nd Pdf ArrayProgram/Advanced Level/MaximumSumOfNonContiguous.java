//42. Write a program to find the maximum sum of a non-contiguous subarray.
class MaximumSumOfNonContiguous{
    public static int maxNonContiguousSum(int[] arr) {
        // Handle edge case if array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        // Initialize variables
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        boolean hasPositive = false;
        // Traverse the array
        for (int num : arr) {
            if (num > 0) {
                currentSum += num;
                hasPositive = true;
            }
            if (num > maxSum) {
                maxSum = num;
            }
        }
        // If there are positive numbers, return their sum
        if (hasPositive) {
            return currentSum;
        } else {
            // If all numbers are negative, return the maximum single element
            return maxSum;
        }
    }
    public static void main(String[] args) {
        // Example usage
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum sum of non-contiguous subarray: " + maxNonContiguousSum(arr));
    }
}
