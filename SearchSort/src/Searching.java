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
    public int Linear(int value, int[] list) {
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
    
}
