package LeetCode;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        int []nums = new int[]{1,2,3,4};
        System.out.println(incremovableSubarrayCount(nums));
        input.close();
    }
    public static int incremovableSubarrayCount(int[] nums) {
        int subarray = nums.length*(nums.length+1)/2;
        for(int i = 0; i < nums.length - 1; i++){
            int start = i;
            int last = i;
            boolean inOrder = true;
            for(int j = 0; j < nums.length - 1; j++){
                    System.out.printf("%d ",nums[j]);
                if(j <= last && j >= start){
                    continue;
                } else{
                    if(nums[j] >= nums[j+1]){
                        inOrder = false;
                    }
                }
                last++;
            }
            if(inOrder){
                subarray--;
            }
        }
        return subarray;
    }  
    
}