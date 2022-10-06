class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0 ; i < n ; i++){
            int left = 0;
            int right = n-1;
            for(int j = 0; j < n/2 ; j++){
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }
        int ans[][] = new int[n][n];
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                if(image[i][j] == 0){
                    ans[i][j] = 1;
                }else{
                    ans[i][j] = 0;
                }
            }
        }
        return ans;
    }
}