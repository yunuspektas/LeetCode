package Q5_First_Bad_Version;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int result=0;

        /**  bad code

         for(int i=0; i<=n; i++){
         if(isBadVersion(i)){
         result= i;
         break;
         }
         }

         **/

        /** bad code-2
         int start =0;
         int finish = n;
         int mid = (start+finish) /2;

         while(!(mid==finish || mid==start) ){

         if(isBadVersion(mid)) {
         finish = mid;

         } else  start = mid;
         mid = (start+finish) /2 ;
         }

         result = mid+1;

         **/
        int start = 1;
        int end = n;
        int ans = 0;
        int mid = start +(end - start)/2;
        while(start <= end)
        {
            if(isBadVersion(mid)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid +1;
            }
            mid = start +(end - start)/2;
        }

        return result=ans;

    }
}

// bu class kod hata vermesin diye eklendi..
class VersionControl {
    public static Boolean isBadVersion(int x) {
        return false;

    }
}
