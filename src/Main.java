public class Main {
    static int FPS = 10;
    static long targetTimeInMilli = 1000/FPS;
    static long waitTime;

    private static long NANO_TO_MILLI = 1000000;
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            long startTime = System.nanoTime();
            System.out.println("YOur code here for the simulation");
            long endTime = System.nanoTime();
            long _diff = endTime - startTime; // in nano
            waitTime = targetTimeInMilli - (_diff/NANO_TO_MILLI);
            Thread.sleep(waitTime);
        }
    }
}