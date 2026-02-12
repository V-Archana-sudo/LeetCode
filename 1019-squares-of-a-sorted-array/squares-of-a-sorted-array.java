class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
                if(nums[i]<0){
                    arr[i] = nums[i]*nums[i];
                }
                else if(nums[i]>0){
                    arr[i] = nums[i] * nums[i];
                }
            }
            Arrays.sort(arr);
            return arr;
        }
    }