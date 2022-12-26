public class Sortbuf {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {    // массив с рандомным набором чисел
            arr[i] = (int) (Math.random() * 1000000000);
        }
        long x = System.currentTimeMillis();
        long z = System.nanoTime();
        boolean isSorted = false;
        {    // сортировка пузырьком
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        isSorted = false;

                        buf = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = buf;
                    }
                }
                break;
            }
            long l = System.currentTimeMillis();
            long k = System.nanoTime();
            System.out.println("bufSort = " + (l - x) + "ms");
            System.out.println("bufSort = " + (k - z) + "nano");

        }
        System.out.println();
    }
}
