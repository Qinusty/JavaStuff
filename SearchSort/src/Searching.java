/**
 * Created by qinusty on 18/02/16.
 */
public class Searching {

    /**
     * Returns the first index of value within the list.
     * @param value
     *      The value to be found.
     * @param list
     *      The list to search.
     * @return
     *      An integer value representing the index of the value within the list.
     *      Or -1 if the value is not found.
     */
    public static int Linear(int value, int[] list) {
        int i = 0;
        for (int x : list) {
            if (x == value) {
                return i;
            }
            i++;
        }
        // Not found anything? return -1
        return -1;
    }
    /**
     * Returns an index of the value within the list.
     * @param value
     *      The value to be found.
     * @param list
     *      The list to search.
     * @return
     *      An integer value representing the index of the value within the list.
     *      Or -1 if the value is not found.
     */
    public static int Binary(int value, int[] list) {
        int left = 0;
        int right = list.length - 1;
        int mid;
        do {
            mid = (left + right) / 2;
            if (list[mid] < value) {
                left = mid + 1;
            } else if (list[mid] > value) {
                right = mid - 1;
            } else if (list[mid] == value){
                return mid;
            }
        } while (right - left > 0);
        return -1;
    }

}
