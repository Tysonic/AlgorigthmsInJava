package org.example.SortingAlgorithms;

public class MergeSort {
    public void merge(int [] arr, int l, int r, int m){
        int n1 = m-l +1;
        int n2 = r-m;
        int L[]  = new int[n1];
        int R[] = new int[n2];
        for(int i = 0;i<n1;i++){
            L[i]=arr[l+i];

        }
        for(int j = 0;j<n2;j++){
            R[j]=arr[m+1+j];
        }
        int i=0, j=0;
        var k = l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k]=R[j];
            j++;
            k++;

        }

    }
    public int [] sort(int arr[],int l, int r){
        // for production implementation, this will have a min bound of 43
        if(r-l<10){
            InsertionSort insert  = new InsertionSort();

            return insert.sort(arr,l,r+1);
        }
        if(l<r){
            int m = (l+r-1)/2;

             sort(arr,l,m);
             sort(arr,m+1,r);
             merge(arr,l,r,m);
        }
        return arr;
    }
}
