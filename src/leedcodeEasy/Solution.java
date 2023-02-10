package leedcodeEasy;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int   count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){

                    if(nums[i]+nums[j]==target){
                        a[count]=i;
                        a[count+1]=j;
                        return a;
                    }
                }
            }
        }
        return a;
    }
}