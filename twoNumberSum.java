public class twoNumberSum {

    public static void main(String args[]) {
        int a[] = { 3, 5, -4, 8, 11, 1, -1, 6 }; // Sample string for testing
        int tSum = 10;
        twoNumSum(a, tSum);
    }

    public static int[] twoNumSum(int[] array, int targetSum) {
        for(int i=0;i<array.length;i++){ // Select 1st element to check sum with the 2nd element
            for(int j=0;j<array.length;j++){ // Loop to cycle through the array for 2nd element
                int sum = array[i] + array[j]; // Sums two numbers
                if((sum == targetSum) && (i != j)){    // Checks sum with targetSum
                    return new int[]{array[i], array[j]}; // Return two numbers if targetSum met
                }
            }
        }
        return new int[0];
    }
}
