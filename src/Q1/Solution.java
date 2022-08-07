package Q1;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int bigger = 0;
        int num1 = 0;


        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                num1 += accounts[i][j];
            }
            if (num1 > bigger) {
                bigger = num1;

            }
            num1 = 0;
        }
        return bigger;
    }
}