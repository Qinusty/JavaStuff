/**
 * Created by qinusty on 18/02/16.
 */
public class Sorting {
    /**
     * Performs the bubbble sort algorithm.
     * @param list
     *      A list of integers to be sorted.
     * @return
     *      The list provided sorted in ascending order.
     */
    public static int[] Bubble(int[] list) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < list.length; i++) {
                if (list[i-1] > list[i]) {
                    int tmp = list[i-1];
                    list[i-1] = list[i];
                    list[i] = tmp;
                    swapped = true;
                }
            }
        }while (swapped);
        return list;
    }

    public static int[] Insertion(int[] list) {
        int j;
        for (int i = 1; i < list.length; i++) {
            j = i;
            while (j > 0 && list[j-1] > list[j]) {
                int tmp = list[j-1];
                list[j-1] = list[j];
                list[j] = tmp;
                j --;
            }
        }
        return list;
    }
}
