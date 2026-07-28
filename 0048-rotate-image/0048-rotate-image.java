class Solution {
    public void rotate(int[][] matrix) {
    int n=matrix.length;

    for(int i=0; i<n; i++){
        for (int j=i; j<n; j++){
            int k=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=k;
        }
    }    
    for (int i=0; i<matrix.length; i++){
        int [] temparr=matrix[i];
        reverse(temparr);
    }
    return ;
    }

    public void reverse (int [] arr){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int k=arr[s];
            arr[s]=arr[e];
            arr[e]=k;

            s++;
            e--;
        }
    }
}