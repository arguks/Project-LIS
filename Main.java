
package com.krisstelargueta.project_lis;

public class Main {

   public static void main(String[] args) {
        Project_LIS lis = new Project_LIS();
        int[] nums = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        
        int maxLength = lis.lengthofLIS(nums);
        System.out.println("The max length is " + maxLength);
    }
    
}
