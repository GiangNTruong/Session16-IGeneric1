package impl;

import design.IGeneric;

public class SortAndSearchImpl<T extends Comparable<T>> implements IGeneric<T> {

    @Override
    public void insertionSort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            T currentValue = arr[i];
            int j;
            for (j = i - 1; j >= 0 && currentValue.compareTo(arr[j]) <= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = currentValue;
        }
    }

    @Override
    public int linerSearch(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(value)==0){
                return 1;
            }
        }
        return -1;
    }

    @Override
    public int binartSearchRecursive(T[] arr, T value) {
        int start = 0;
        int end =arr.length-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if (arr[mid].compareTo(value)>0){
                end = mid-1;
            }else if (arr[mid].compareTo(value)<0){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    @Override
    public void bubbleSort(T[] arr) {
        boolean isNextPast = true;
        for (int i = 1; i < arr.length&isNextPast; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                isNextPast =false;
                if (arr[j].compareTo(arr[j+1])>0){
                    isNextPast = true;
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }



    @Override
    public void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int indexMin =1 ;
            T valueMin = arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j].compareTo(valueMin)<0){
                    indexMin=j;
                    valueMin=arr[j];
                }
            }
            arr[indexMin] = arr[i];
            arr[i]=valueMin;
        }
    }
}
