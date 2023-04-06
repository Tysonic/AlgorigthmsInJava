package org.example.QuestionsOnSorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * An interval is represented as a combination of start time and end time. Given a set of intervals, check if any two intervals intersect.
 *
 * Examples:
 *
 * Input:  arr[] = {{1, 3}, {5, 7}, {2, 4}, {6, 8}}
 * Output: true
 * The intervals {1, 3} and {2, 4} overlap
 *
 *
 * Input:  arr[] = {{1, 3}, {7, 9}, {4, 6}, {10, 13}}
 * Output: false
 * No pair of intervals overlap.
 * Expected time complexity is O(nLogn) where n is number of intervals.
 */
class CheckIntervalsIntersectionInGivenSet {
    static  class Interval{
        int start;
        int end;
        public Interval(int start, int end){
            super();
            this.start = start;
            this.end = end;
        }


    }
    static Boolean checkCollision(Interval[] arr,int n){
        Arrays.sort(arr,(i1,i2)->{
            return i1.start -i2.start;
        });
        for(int i = 1; i < n; i++)
            if (arr[i - 1].end > arr[i].start)
                return true;
        return  false;
    }

    public static void main(String[] args)
    {
        Interval arr1[] = { new Interval(1, 3),
            new Interval(7, 9),
            new Interval(4, 6),
            new Interval(10, 13) };
        int n1 = arr1.length;

        if (checkCollision(arr1, n1))
            System.out.print("Yes\n");
        else
            System.out.print("No\n");

        Interval arr2[] = { new Interval(6, 8),
            new Interval(1, 3),
            new Interval(2, 4),
            new Interval(4, 7) };
        int n2 = arr2.length;

        if (checkCollision(arr2, n2))
            System.out.print("Yes\n");
        else
            System.out.print("No\n");
    }
}
