class Solution {
    public int missingNumber(int[] nums) {
       int range=nums.length;

       int actualsum=(range*(range+1))/2;   //finding the actual sum of at n number of value using (n*(n+1))/2

       int currentsum=0;

       for (int i=0; i<nums.length; i++){
        currentsum=currentsum+nums[i];

       }
       int ans= actualsum-currentsum;

       return ans; //this time complexity is o(n) for best case
    }
}