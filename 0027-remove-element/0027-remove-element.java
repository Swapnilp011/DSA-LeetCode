class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr=0;

        for (int i=0; i<nums.length; i++){

            if (nums[i]!=val){
                nums[ptr]=nums[i];
                ptr++;  //in this case we use the pointer ans store each value in the ptr ans then return it 
            }
        }
        return ptr;
    }
}