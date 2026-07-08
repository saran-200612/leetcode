class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length*matrix.length;
        int arr[]=new int[n];
        int l=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[l]=matrix[i][j];
                l++;
            }
        }
        Arrays.sort(arr);int c=arr[k-1];
        return c;
    }
}
