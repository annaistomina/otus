import java.util.Arrays;

public class SortArray2 {

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {    // массив с рандомным набором чисел
            arr[i] = (int) (Math.random() * 100000000);
        }
        long x = System.currentTimeMillis();
        long z = System.nanoTime();
        Arrays.sort(arr);
        {// сортировка collection.sort
            long l = System.currentTimeMillis();
            long k = System.nanoTime();
            System.out.println("collectionSort = " + (l - x) + "ms");
            System.out.println("collectionSort = " + (k - z) + "nano");
        }
        System.out.println();
    }

}








