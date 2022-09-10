public class mission2 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3,-2, 5, 1};
        int result =maxSubArray(array);
        System.out.println(result);
    }

    public static int maxSubArray(int[] nums) {
            int pre = 0, maxAns = nums[0];
            for (int x : nums) {
                pre = Math.max(pre + x, x);
                maxAns = Math.max(maxAns, pre);
            }
            return maxAns;
    }
}




