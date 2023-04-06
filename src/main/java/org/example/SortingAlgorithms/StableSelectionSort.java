package org.example.SortingAlgorithms;

public class StableSelectionSort {
    public int [] sort (int [] input){


        for(var x = 0;x<input.length-1;x++){
            int minIndex = x;
            for(var j=x+1;j<input.length;j++){
                if(input[j]<input[minIndex]){
                    minIndex = j;
                }
            }
            int key = input[minIndex];
            while (minIndex>x){
                input[minIndex]= input[minIndex-1];
                minIndex--;
            }
            input[x]= key;
        }
        return  input;
    };
}
