public class Q1 {
    /** Returns the sum of all integers in arr that are divisible by num
     * Precondition: num > 0
     */
    public static int divBySum(int[] arr, int num)
    {
        int sum = 0;
        for (int nums : arr) {
            if (nums % num == 0) {
                sum += nums;
            }
        }
        return sum;
    }

}
