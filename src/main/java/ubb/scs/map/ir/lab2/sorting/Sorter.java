package ubb.scs.map.ir.lab2.sorting;

public abstract class Sorter {
    protected  int[] listOfNumbers;

    public Sorter(int[] numbers){
        this.listOfNumbers  = numbers;
    }

    public abstract void sort();
}
