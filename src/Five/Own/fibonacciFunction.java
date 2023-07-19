package Five.Own;

import static Time.TimeSet.timeEnd;
import static Time.TimeSet.timeStart;

public class fibonacciFunction {
    public static long fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibo(x-1) + fibo(x-2);
    }

    public static void main (String[] args) {
        long start = timeStart();

        System.out.println(fibo(50));

        timeEnd(start);
    }
}
