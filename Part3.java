import java.util.Map;
import java.util.LinkedHashMap;

public class Part3 {

    public static void main(String[] args) {
        int[] numbers = new int[] { 3, 4, 9, 14, 15, 19, 28, 37, 47, 50, 54, 56, 59, 61, 70, 73, 78, 81, 92, 95, 97, 99 };
        //int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 11 };
        System.out.println(seqCount(numbers));
    }

    private static int seqCount(int[] numbers) {
        int count = 0;
        // number -> number of different sums + 1 if number present in given numbers
        Map<Integer, Integer> sums = new LinkedHashMap<>();
        for (int n : numbers) {
            if (sums.containsKey(n)) {
                count += sums.get(n);
            }

            Map<Integer, Integer> copy = new LinkedHashMap<>(sums);
            for (Map.Entry<Integer, Integer> entry : copy.entrySet()) {
                sums.merge(n + entry.getKey(), entry.getValue(), Integer::sum);
            }

            sums.merge(n, 1, Integer::sum);
        }

        return count;
    }
}
