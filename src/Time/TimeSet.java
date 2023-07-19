package Time;

public class TimeSet {
    public static long timeStart() {
        return System.currentTimeMillis();
    }

    public static void timeEnd(long startTime) {
        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));
    }
}

