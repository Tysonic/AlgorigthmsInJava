package org.example.SortingAlgorithms;

public class SelectionSort {
    public int [] sort (int [] input){


        for(var x = 0;x<input.length-1;x++){
            int minIndex = x;
            for(var j=x+1;j<input.length;j++){
                if(input[j]<input[minIndex]){
                    minIndex = j;
                   // input[minIndex] = input[j];
                }
            }
            if(input[minIndex] <input[x]){
                int temp = input[x];
                input[x]=input[minIndex];
                input[minIndex]= temp;
            }

        }
        return  input;
    };

}
