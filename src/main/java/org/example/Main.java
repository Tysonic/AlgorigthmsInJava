package org.example;


import org.example.QuestionsOnSorting.DutchNationalFlagProblem;
import org.example.QuestionsOnSorting.SortArrayInWaveForm;
import org.example.QuestionsOnSorting.SortEvenPlacedAndOddPlaced;
import org.example.SortingAlgorithms.QuickSortReverse;

public class Main {

    public static void main(String[] args) {
        int [] input = new int[] {20, 10, 8, 6, 4, 2,1,2,3,1,2,4,3,5,4};
        var sort = new SortEvenPlacedAndOddPlaced();
        int[] output = sort.sortLessSpace(input);
        printResults(output);
    }

    private static void  printResults(int [] input) {
        for (var x = 0; x < input.length-1; x++) {
            System.out.print(input[x]+", ");
        }
        System.out.print(input[input.length-1]);

    }
}