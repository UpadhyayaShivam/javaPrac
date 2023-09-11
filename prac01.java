import java.util.Arrays;
import java.util.*;


public class prac01 {

        static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;

            int concatedArr [] = new int[n+m];
            for(int i=0;i<n;i++){
                concatedArr[i] = nums1[i];
            }
            for(int i=0;i<m;i++){
                concatedArr[n+i] = nums2[i];
            }
        double ans =0;
            Arrays.sort(concatedArr);

            if((n+m)%2 == 0 ){

                ans = (concatedArr[(n+m)/2] + concatedArr[(n+m)/2+1])/2;
                 
            }
            else{

                    ans = (concatedArr[(n+m)/2]);
                
            }
            return ans;
        }
    public static void main(String[] args) {
        int nums1 [] = {1,2,3};
        int nums2 [] = {4,5,6};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    
}
