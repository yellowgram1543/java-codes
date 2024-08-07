import java.util.Arrays;

public class a15_BuildArrayFromPermutation_1 {
    // Using iterative method
    public static void main(String[] args) {
        int[] nums =  {0, 2, 1, 5, 3, 4};
        //initializing
        int[] ans = new int[nums.length];
        //iterating
        for (int i = 0; i< nums.length; i++){
            //assigning
            ans[i] = nums[nums[i]];
        }
        //output
        System.out.println(Arrays.toString(ans));
    }
}
