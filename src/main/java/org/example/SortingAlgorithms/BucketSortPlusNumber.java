package org.example.SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketSortPlusNumber {
    public static void bucketSort(double[] arr, int noOfBuckets)
    {

        // find the max and min elements in the array
        double maxEle = Arrays.stream(arr).max().getAsDouble();
        double minEle = Arrays.stream(arr).min().getAsDouble();

        // find the range between the max and min elements
        double range = (maxEle - minEle) / noOfBuckets;

        // create a list of empty lists to store elements based on their bucket index
        List<List<Double>> temp = new ArrayList<>();
        for (int i = 0; i < noOfBuckets; i++) {
            temp.add(new ArrayList<>());
        }

        // distribute the elements of the array into the appropriate bucket based on their value
        for (int i = 0; i < arr.length; i++)
        {
            double diff = (arr[i] - minEle) / range - (int)((arr[i] - minEle) / range);

            // check if the difference is 0, and the element is not the min element
            if (diff == 0 && arr[i] != minEle) {
                temp.get((int)((arr[i] - minEle) / range) - 1).add(arr[i]);
            } else {
                temp.get((int)((arr[i] - minEle) / range)).add(arr[i]);
            }
        }

        // sort each non-empty bucket using the internal sort method
        for (int i = 0; i < temp.size(); i++) {
            if (!temp.get(i).isEmpty()) {
                temp.get(i).sort(Double::compare);
            }
        }

        // combine the sorted elements from
        // each non-empty bucket into a single array
        int k = 0;
        for (List<Double> lst : temp) {
            if (!lst.isEmpty()) {
                for (double i : lst) {
                    arr[k] = i;
                    k++;
                }
            }
        }
    }
}
