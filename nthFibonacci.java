public class nthFibonacci {

    public static void main(String args[]) {
        int n = 5; //Taking sample number as 5
        System.out.println(n+"th Fibonacci is "+getNthFib(n));
    }

    public static int getNthFib(int n) {

        if (n == 1) // Considering 1st element of Fibonacci to be 0, i.e Not considering it as 0th element
            return 0;
        else if (n == 2) // Considering 2nd element of Fibonacci to be 1
            return 1;
        else
            return (getNthFib(n - 1) + getNthFib(n - 2)); // F(n) = F(n-1) + F(n-2)

    }
}