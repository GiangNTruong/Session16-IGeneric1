package design;

public interface IGeneric <T extends  Comparable<T>>{
    void insertionSort(T[] arr);
    int linerSearch(T[] arr , T value);
    int binartSearchRecursive(T[] arr , T value);
    void bubbleSort(T[] arr);
    void selectionSort(T[] arr);
}
