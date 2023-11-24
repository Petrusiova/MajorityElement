import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class provides a method to find the majority element in an array.
 */
public class Majority {

    /**
     * This method finds the majority element in an array.
     * The majority element is the one that appears the most of the time in the array.
     * If the array only contains one element, that element is returned.
     * If no majority element is found, it returns the element with the highest occurrence.
     *
     * @param arr The input array of integers.
     * @return The majority element in the array.
     */
    public static Number majoritySearch(Number[] arr) {

        Number majority;

        if (arr.length == 1) {
            majority = arr[0];
        } else {

            majority =
                    Arrays.stream(arr)
                            .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                            .entrySet()
                            .stream()
                            .max(Map.Entry.comparingByValue())
                            .get()
                            .getKey();
        }

        System.out.println("Output: " + majority);

        return majority;
    }
}
