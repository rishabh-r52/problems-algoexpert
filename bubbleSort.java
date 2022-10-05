public class algoex4 {

    public static void main(String[] args) {
        int array[] = {5,2,4,9,7,1};
        bubbleSort(array);
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}