package org.example.SortingAlgorithms;

import java.util.Arrays;

public class RadixSort {
    public  int [] sort(int [] input){
        int m = getMax(input);
        for(var exp =1;m/exp>0;exp *=10){
            countSort(input,exp);
        }
        return input;
    }

    private  static void countSort(int [] arr, int exp){
        int n = arr.length;
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++) {
            int val = arr[i]/ exp;
            var index = (val ) % 10;
            count[index]++;
        }
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    private  static  int getMax(int [] input){
        int max = input[0];
        for(var x =1;x<input.length;x++){
            if(input[x]>max){
                max = input[x];
            }
        }
        return max;
    }
}
