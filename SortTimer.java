public class SortTimer {
    public static long timeSort(SortAlgorithm algorithm, int[] array) {
        long startTime = System.nanoTime();
        algorithm.sort(array.clone());  // Clone to ensure the sort is performed on the same input
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
