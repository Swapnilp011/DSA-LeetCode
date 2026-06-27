class Solution {
    public int tribonacci(int n) {
      if (n==0){
        return 0;
      }  
      else if (n==1){
        return 1;
      }
      else {
        int fterm=0;
        int sterm=1;
        int tterm=1;
        for (int i=1; i<=n; i++){
            int frterm=fterm+sterm+tterm;

            fterm=sterm;
            sterm=tterm;
            tterm=frterm;
        }
        return fterm;
      }
    }
}