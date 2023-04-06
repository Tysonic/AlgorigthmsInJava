package org.example.SortingAlgorithms;

import java.util.List;
/*
* Basically indexing of insertion sort starts from zero.
* here we start with l, because we are using insertion sort for improving the execution time of merge sort
* */
public class InsertionSort {
    public  int [] sort (int [] input,int l,int r){
        for(var x=l+1;x<r;x++){
            int key = input[x];
            int j=x-1;
            while(j>=l && input[j]>key){
                input[j+1]=input[j];
                j -=1;
            }
            input[j+1]=key;
        }
        return input;
    }
}
