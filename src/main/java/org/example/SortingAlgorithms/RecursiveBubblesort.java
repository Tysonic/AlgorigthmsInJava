package org.example.SortingAlgorithms;

public class RecursiveBubblesort {
    public int [] sort (int [] input){
        boolean sorted = true;
        for(var x =0;x<input.length-1;x++){

            if(input[x]>input[x+1]){
                var temp = input[x];
                input[x]=input[x+1];
                input[x+1]= temp;
                sorted = false;
            }
        }

        if(!sorted){
            return sort(input);
        }
        else return input;
    }
}
