package org.example.QuestionsOnSorting;


import java.util.*;

/**
 * Print the elements of an array in the decreasing frequency if 2 numbers have the same frequency then print the one which came first
 * Examples
 * Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
 * Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}
 * <p>
 * Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
 * Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
 */

class ele {
    int count, index, val;

}

class compareOne implements Comparator<ele> {
    public  int compare(ele a, ele b){
        return (a.val-b.val);
    }
}

class compareTwo implements Comparator<ele>{
    public int compare(ele a, ele b){
        if(a.count != b.count){
            return (a.count - b.count);
        }
        return b.index - a.index;
    }
}

public class SortByFrequency {
    public int[] sortByFrequency(int[] arr, int n){
        ArrayList<ele> element = new ArrayList<ele>();
        for(var x=0;x<n;x++){
            element.add(new ele());
            element.get(x).index = x;
            element.get(x).val = arr[x];
            element.get(x).count = 1;
        }

        Collections.sort(element,new compareOne());

        for(var x=1;x<n;x++){
            if(element.get(x).val == element.get(x-1).val){
                element.get(x).count += element.get(x-1).count;
                element.get(x-1).count = -1;
                element.get(x).index = element.get(x-1).index;
            }
        }

        Collections.sort(element,new compareTwo());

        for(int x =n-1,index=0;x>=0;x--){
            if(element.get(x).count != -1){
                for(int y = 0;y<element.get(x).count;y++){
                    arr[index++] = element.get(x).val;
                }
            }
        }
        return arr;
    }



}

// Java program for above approach

