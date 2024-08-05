import java.util.*;

class Solution {
    public int maximumProductSubarray(int nums[]) {
        int prefix = 1;
        int suffix = 1;
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }

            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length - i - 1];

            maximum = Math.max(maximum, Math.max(prefix, suffix));
        }

        return maximum;
    }
}
public class Solution1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=1;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution solution = new Solution();
        int result = solution.maximumProductSubarray(nums);
        System.out.println(" Maximum Product Subarray is :"+result);


    }
}