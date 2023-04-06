package org.example.QuestionsOnSorting;

import org.example.SortingAlgorithms.QuickSort;
import org.example.SortingAlgorithms.QuickSortReverse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * We are given an array of n distinct numbers. The task is to sort all even-placed numbers in increasing and odd-placed numbers in decreasing order. The modified array should contain all sorted even-placed numbers followed by reverse sorted odd-placed numbers.
 *
 * Note that the first element is considered as even placed because of its index 0.
 *
 * Examples:
 *
 * Input:  arr[] = {0, 1, 2, 3, 4, 5, 6, 7}
 * Output: arr[] = {0, 2, 4, 6, 7, 5, 3, 1}
 * Even-place elements : 0, 2, 4, 6
 * Odd-place elements : 1, 3, 5, 7
 * Even-place elements in increasing order :
 * 0, 2, 4, 6
 * Odd-Place elements in decreasing order :
 * 7, 5, 3, 1
 *
 * Input: arr[] = {3, 1, 2, 4, 5, 9, 13, 14, 12}
 * Output: {2, 3, 5, 12, 13, 14, 9, 4, 1}
 * Even-place elements : 3, 2, 5, 13, 12
 * Odd-place elements : 1, 4, 9, 14
 * Even-place elements in increasing order :
 * 2, 3, 5, 12, 13
 * Odd-Place elements in decreasing order :
 * 14, 9, 4, 1
 *
 * Time Complexity: O(n Log n)
 * Auxiliary Space: O(n)
 */
public class SortEvenPlacedAndOddPlaced {
    public int [] sort(int [] arr ){
        int[] even = new int[arr.length%2==1 ?arr.length/2+1:arr.length/2];
        int[] odd = new int[arr.length/2];
        for(int x=0,y=1;y<arr.length;x=x+2,y=y+2){
            even[x/2]=arr[x];
            odd[x/2]=arr[y];
        }
        if (arr.length%2==1) even[even.length-1]=arr[arr.length-1];
        QuickSortReverse sortReverse = new QuickSortReverse();
        QuickSort sort = new QuickSort();
        even = sort.sort(even,0, arr.length/2-1);
        odd = sortReverse.sort(odd,0, arr.length/2-1);
        int index = 0;
        for(int x =0;x<even.length;x++){
            arr[index++]=even[x];
        }
        for(int x =0;x<odd.length;x++){
            arr[index++]=odd[x];
        }

        return arr;
    }

    public  int[] sortLessSpace(int[] arr){
        int n = arr.length;
        for(int x=0;x<n;x++){
            if(x%2==1){
                arr[x]= -1*arr[x];
            }
        }
        Arrays.sort(arr);
        int mid = (n)/2;
        System.out.println(arr[mid]);

        for(int y = 0;y<mid;y++){
            int temp = arr[y];
            arr[y]=arr[y+mid];
            arr[mid+y]= -1*temp;
        }
        if(n%2!=0) {
            for (int y = mid; y < n; y++) {
                int temp = arr[y];
                arr[y] = arr[n-1];
                arr[n-1] = temp;
            }
        }
        System.out.println(arr[mid]);
        return arr;
    }


}
