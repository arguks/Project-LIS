package com.krisstelargueta.project_lis;

public class Project_LIS {

    public int lengthofLIS(int arr []){
        //chekcing if the array is null
        if(arr == null){
            return 0;
        }
        
        //array of the lengths of lis
        int [] lengths = new int[arr.length];
        
        //iterating through arr to find the lengths
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j] && lengths[i] < lengths[j] + 1) {
                    lengths[i] = lengths[j] + 1;
                }
            }
        }
        
        //this will find the largest number in the lengths array
        int maxLength = -1;
        for (int i = 1; i < lengths.length; i++) {
            if (lengths[i] > maxLength) {
                maxLength = lengths[i];
            }
        }
        return maxLength+1;
    }
    
}
