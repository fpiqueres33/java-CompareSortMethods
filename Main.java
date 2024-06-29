import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random random = new Random();

        // Fill the array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        SortAlgorithm quickSort = new QuickSort();
        SortAlgorithm mergeSort = new MergeSort();
        SortAlgorithm timSort = new TimSortAdapter();

        System.out.println("Time taken by QuickSort: " + SortTimer.timeSort(quickSort, numbers) + " nanoseconds");
        System.out.println("Time taken by MergeSort: " + SortTimer.timeSort(mergeSort, numbers) + " nanoseconds");
        System.out.println("Time taken by TimSort: " + SortTimer.timeSort(timSort, numbers) + " nanoseconds");
    }
}
