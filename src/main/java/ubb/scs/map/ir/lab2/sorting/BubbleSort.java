package ubb.scs.map.ir.lab2.sorting;

public class BubbleSort extends Sorter {
    public BubbleSort(int[] numbers) {
        super(numbers);
    }

    @Override
    public void sort() {
        for(int i=0; i < listOfNumbers.length; i++){
            for(int j=0; j< listOfNumbers.length-i; j++){
                if(listOfNumbers[j]>listOfNumbers[i]){
                    int aux = listOfNumbers[i];
                    listOfNumbers[i] = listOfNumbers[j];
                    listOfNumbers[j] = aux;
                }
            }
        }
    }
}
