
class StopWatch {
    long startTime;
    long endTime;
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
    public long getStartTime() {
        return startTime;
    }
    public long getStopTime() {
        return endTime;
    }
}

public class Bai2 {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        StopWatch sW = new StopWatch();
        sW.start();
        selectionSort(arr);
        sW.stop();
        System.out.println("Elapsed time: " + sW.getElapsedTime() + " ms");
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[minIndex] = temp;
        }
    }
}
