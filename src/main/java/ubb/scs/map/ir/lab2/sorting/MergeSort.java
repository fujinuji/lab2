package ubb.scs.map.ir.lab2.sorting;

public class MergeSort extends Sorter {
    public MergeSort(int[] numbers) {
        super(numbers);
    }

    public static void mergeSortRec(int[] array)
    {
        if(array == null)
        {
            return;
        }

        if(array.length > 1)
        {
            int mid = array.length / 2;

            // partea stanga
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = array[i];
            }

            // partea dreapta
            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i++)
            {
                right[i - mid] = array[i];
            }

            mergeSortRec(left);
            mergeSortRec(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // facem merge la dreapta si stanga
            while(i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                {
                    array[k] = left[i];
                    i++;
                }
                else
                {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length)
            {
                array[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length)
            {
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }

    @Override
    public void sort() {
        mergeSortRec(listOfNumbers);
    }
}
