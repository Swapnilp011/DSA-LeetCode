class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans= new int[nums.length];

        int start=0;
        int end=nums.length-1;
        int ptr=nums.length-1;

        while(start<=end){
            int starts=nums[start]*nums[start];
            int ends=nums[end]*nums[end];
            if(starts>ends){
                ans[ptr]=starts;
                start++;
            }else{
                ans[ptr]=ends;
                end--;
              
            }
              ptr--;
        }
          return ans;

    }
}