package Q4;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        System.out.println(Arrays.toString(kWeakestRows(mat, 3)));
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int[] score = new int[m];
        int j;
        for(int i =0; i< m; i++){
            j=0;
            for(; j< n; j++){
                if(mat[i][j] == 0){
                    break;
                }
            }

            score[i] = j * m + i;
        }


        Arrays.sort(score);
        for(int i = 0; i< m; i++) {
            score[i] %= m;
        }
        return Arrays.copyOfRange(score, 0 , k);
    }
}
