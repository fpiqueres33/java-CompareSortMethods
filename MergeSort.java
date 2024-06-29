public class MergeSort implements SortAlgorithm {
    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];

        System.arraycopy(array, left, leftArray, 0, leftArray.length);
        System.arraycopy(array, mid + 1, rightArray, 0, rightArray.length);

        int leftIndex = 0, rightIndex = 0;
        int originalIndex = left;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[originalIndex++] = leftArray[leftIndex++];
            } else {
                array[originalIndex++] = rightArray[rightIndex++];
            }
        }

        while (leftIndex < leftArray.length) {
            array[originalIndex++] = leftArray[leftIndex++];
        }

        while (rightIndex < rightArray.length) {
            array[originalIndex++] = rightArray[rightIndex++];
        }
    }

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }
}

