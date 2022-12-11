import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {    // массив с рандомным набором чисел
            arr[i] = (int) (Math.random() * 100);
        }    //System.out.print(arr[i] + " ");     // вывод массива на экран

        Arrays.sort(arr); // сортировка collection.sort


         /*boolean isSorted = false;    // сортировка пузырьком
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
            }*/

        // сортировка выбором
           /* for (int i = 0; i < arr.length; i++) {    // i - номер текущего шага
                int pos = i;
                int min = arr[i];
                // цикл выбора наименьшего элемента
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < min) {
                        pos = j;    // pos - индекс наименьшего элемента
                        min = arr[j];
                    }
                }
                arr[pos] = arr[i];
                arr[i] = min;    // меняем местами наименьший с array[i]*/
        System.out.println(Arrays.toString(arr));
    }
}










