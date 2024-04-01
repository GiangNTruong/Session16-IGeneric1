package run;
import impl.SortAndSearchImpl;

    public class Test {
        public static void main(String[] args) {
            SortAndSearchImpl<Integer> sortAndSearch = new SortAndSearchImpl<>();

            Integer[] arr = {5, 3, 2, 8, 1};
            System.out.println("Mảng ban đầu: " + java.util.Arrays.toString(arr));

            sortAndSearch.insertionSort(arr);
            System.out.println("Mảng sau khi sắp xếp chèn: " + java.util.Arrays.toString(arr));

            int index = sortAndSearch.linerSearch(arr, 3);
            System.out.println("Chỉ số của 3 trong mảng: " + index);

            index = sortAndSearch.binartSearchRecursive(arr, 3);
            System.out.println("Chỉ số của 3 trong mảng (tìm kiếm nhị phân): " + index);

            Integer[] arr2 = {5, 3, 2, 8, 1};
            sortAndSearch.bubbleSort(arr2);
            System.out.println("Mảng2 sau khi sắp xếp nổi bọt: " + java.util.Arrays.toString(arr2));

            Integer[] arr3 = {5, 3, 2, 8, 1};
            sortAndSearch.selectionSort(arr3);
            System.out.println("Mảng3 sau khi sắp xếp chọn: " + java.util.Arrays.toString(arr3));

        }
    }


