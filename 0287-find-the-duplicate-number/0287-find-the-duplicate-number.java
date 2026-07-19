class Solution {
    public int findDuplicate(int[] nums) {

        int ans=0;
     for (int i=0; i<nums.length; i++){
        int ele=Math.abs(nums[i]);

        if(nums[ele]<0){
            ans=ele;
            break;
        }else{
           nums[ele]=-nums[ele];
            
        }
     } 
     return ans;  
    }
}