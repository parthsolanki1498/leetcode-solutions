import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,5};
        int target = 9;
        // int ans[] = twoSumBrute(nums, target);
        int ans[] = twoSumHash(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSumHash(int[] nums, int target) {
        Map<Integer,Integer> twoSumHash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(twoSumHash.containsKey(complement)){
                return new int[] {twoSumHash.get(complement),i};
            }
            twoSumHash.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match found");
    }

    // private static int[] twoSumBrute(int[] nums, int target) {
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 return new int[] {i,j};
    //             }
    //         }
    //     }
    //     throw new IllegalArgumentException("No match found");
    // } 
}
