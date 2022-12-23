import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {    // массив с рандомным набором чисел
            arr[i] = (int) (Math.random() * 100000000);
        }

        Arrays.sort(arr);
        {// сортировка collection.sort
            long l = System.currentTimeMillis();
            long k = System.nanoTime();
            System.out.println("collectionSort = " + l + "ms");
            System.out.println("collectionSort = " + k + "nano");
        }

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
            System.out.println("bufSort = " + l + "ms");
            System.out.println("bufSort = " + k + "nano");

        }
            System.out.println();
    }

}








