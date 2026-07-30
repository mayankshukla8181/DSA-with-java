class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            // step 1: sum create krte h 
            sum = sum + nums[i];
            // step 2 : maxi update karte h  
            maxi = Math.max(maxi , sum);
            // step 3 : sum check krte h for negative value
            if(sum <0)
            sum = 0;
        }
        // return max value 
        return maxi;
        
    }
}