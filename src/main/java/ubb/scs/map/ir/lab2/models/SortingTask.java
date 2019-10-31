package ubb.scs.map.ir.lab2.models;

import ubb.scs.map.ir.lab2.sorting.BubbleSort;
import ubb.scs.map.ir.lab2.sorting.MergeSort;
import ubb.scs.map.ir.lab2.sorting.Sorter;
import ubb.scs.map.ir.lab2.utils.SortingMethod;

import java.util.Arrays;

public class SortingTask extends Task {
    private Sorter sorter;
    private int[] elements;

    public SortingTask(SortingMethod sortingMethod, int[] listOfElements) {
        super("", "");

        elements = Arrays.copyOf(listOfElements, listOfElements.length);
        switch (sortingMethod) {
            case BUBBLE_SORT:
                sorter = new BubbleSort(elements);
            case MERGE_SORT:
                sorter = new MergeSort(elements);
        }
    }

    @Override
    public void execute() {
        sorter.sort();
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
