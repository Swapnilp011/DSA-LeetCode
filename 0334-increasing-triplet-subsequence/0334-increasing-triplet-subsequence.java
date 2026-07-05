class Solution {
    public boolean increasingTriplet(int[] nums) {

     int f=Integer.MAX_VALUE;
     int s=Integer.MAX_VALUE;
     int t=Integer.MAX_VALUE;

     for (int i=0; i<nums.length; i++){

        int ele=nums[i];

        if(f>=ele){
            f=ele;
        }else if(s>=ele){
            s=ele;
        }else{
            t=ele;
            return true;
        }
     }
        return false;
    }
}