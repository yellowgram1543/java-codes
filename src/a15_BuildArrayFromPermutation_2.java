import java.util.Arrays;

public class a15_BuildArrayFromPermutation_2 {
    //Using In-place
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 3};
        //initializing and input
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] buildArray(int[] nums){
        int n = nums.length;
        //encodes(putting) into higher bits
        for (int i = 0; i < n ; i++){
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }
        //decodes(extracting) from the higher bits
        for (int i = 0; i < n; i++){
            nums[i] = nums[i] / n;
        }
        //output
        return nums;
    }
}
