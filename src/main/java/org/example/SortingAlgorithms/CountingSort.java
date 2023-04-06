package org.example.SortingAlgorithms;

public class CountingSort {
public  int [] sort (int [] input){
    var n = input.length;
    int [] count = new int[255];
    int [] output = new int[n];

    for(var x=0;x<255;x++){
        count[x]=0;
    }
    for(var y=0;y<n;y++){
        ++count[input[y]];
    }
    for (var x=1;x<255;x++){
        count[x] += count[x-1];
    }



    for(int i = n-1;i>=0;i--){
        output[count[input[i]]-1] = input[i];
        --count[input[i]];
    }
    return output;
}
}
