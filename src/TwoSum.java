public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] y = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    y[0] = i;
                    y[1] = j;
                    break;
                }
            }
        }
        return y;
    }
}
