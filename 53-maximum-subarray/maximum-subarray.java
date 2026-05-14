class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int cs = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(cs<0){
                cs=0;
            }
            cs=cs+nums[i];
            if(cs>ans){
                ans=cs;
            }
        }
        return ans;
    }
}