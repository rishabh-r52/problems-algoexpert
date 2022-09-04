public class twoNumberSum {

    public static void main(String args[]) {
        int a[] = { 3, 5, -4, 8, 11, 1, -1, 6 };
        int tSum = 10;
        twoNumSum(a, tSum);
    }

    public static int[] twoNumSum(int[] array, int targetSum) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                int sum = array[i] + array[j];
                if((sum == targetSum) && (i != j)){   
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
}
