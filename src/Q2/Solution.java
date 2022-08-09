package Q2;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k=3;
        int threshold = 4;
        int result = numOfSubarrays(arr,k,threshold);
        System.out.println("result = " + result);
        
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int[] arr2 = new int[k];
        int sum =0;
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(i==arr.length-(k-1)) break;
            System.arraycopy(arr, i, arr2, 0, k);
            for(int j=0;j<k;j++){
                sum+=arr2[j];
            }

            if(sum>=(threshold*k)) {
                count++;
                System.out.println(Arrays.toString(arr2) + " sum = " + sum);
            }
            sum=0;

        }
        return count;
    }
}
