package org.example.QuestionsOnSorting;

/**
 * Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array.
 * The functions should put all 0s first, then all 1s and all 2s in last.
 *
 * Input: {0, 1, 2, 0, 1, 2}
 * Output: {0, 0, 1, 1, 2, 2}
 *
 * Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
 * Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 * Time Complexity: O(n), Only one traversal of the array is needed.
 * Space Complexity: O(1), No extra space is required.
 */
public class DutchNationalFlagProblem {
    public int [] sortByCount (int[] arr){
        int n = arr.length;
        int c0=0,c1=0,c2=0,index=0;
        for(var x =0;x<n;x++){
            if(arr[x]==0) c0++;
            else if(arr[x]==1)c1++;
            else c2++;
        }

        while (c0>0){
            arr[index]=0;
            index++;
            c0--;
        }
        while (c1>0){
            arr[index]=1;
            index++;
            c1--;
        }
        while (c2>0){
            arr[index]=2;
            index++;
            c2--;
        }
        return arr;
    }

    public  int[] sortByPosition(int [] arr){
        int temp,mid=0,lo=0,hi =arr.length-1;


        while (mid<=hi){
            switch (arr[mid]){
                case 0:
                    temp = arr[mid];
                    arr[mid]=arr[lo];
                    arr[lo]=temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid]=arr[hi];
                    arr[hi]=temp;
                    hi--;
                    break;
            }
        }
        return arr;
    }
}
