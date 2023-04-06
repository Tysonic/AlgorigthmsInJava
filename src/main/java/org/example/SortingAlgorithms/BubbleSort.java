package org.example.SortingAlgorithms;

public class BubbleSort {
    public  int [] sort(int [] input){
        int n = input.length;
        boolean swapped = false;
        for(int x=0;x<n-1;x++){
            for(int j=0;j<n-1;j++){
                if(input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]= input[j+1];
                    input[j+1]=temp;
                    swapped = true;
                }

            }
            if(!swapped) return input;
        }
        return  input;
    }
}
