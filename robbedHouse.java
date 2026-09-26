public class robbedHouse {
static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        rob(nums);
    }
static void rob(int[] nums) {
        int index = 0;
         int ans = solve(nums, index);
        System.out.println(ans);}
static int solve(int[]nums, int index ){
    if(index >= nums.length){
        return 0; 
    }
    int includeAns = nums[index] + solve(nums,index + 2);
    int excludeAns = 0 + solve(nums, index + 1);
    int finalAns = Math.max(includeAns , excludeAns );
    return finalAns ;
}
  
        
    }
