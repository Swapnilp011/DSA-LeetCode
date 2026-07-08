class Solution {
    public int findLucky(int[] arr) {
      int [] nums=new int[1001];
      int max=-1;
      for (int val:arr){
        nums[val]++;
      }
        for( int i=1; i<nums.length; i++){
            if (nums[i]==i){
                max=Math.max(max,i);
            }
        }
        return max;
    }
}