class Solution {
    public String reverseWords(String s) {
        String [] arr=s.split("\\s+"); // the  spilt is used for the it split on the basis of space it define the only one space at after a every woard

        StringBuilder sb=new StringBuilder (" ");
        for (int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]+" ");
        }
        String ans=sb.toString();
        ans=ans.trim(); // trim funtion remove trailing and leading space it remove the ending space ater the end ward 

        return ans;
    }
}