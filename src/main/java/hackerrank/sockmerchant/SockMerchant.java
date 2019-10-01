package hackerrank.sockmerchant;

import java.util.HashMap;
import java.util.Map;

class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> occurrencesMap = new HashMap<>();
        for (int i : ar) {
            occurrencesMap.computeIfPresent(i, (integer, integer2) -> ++integer2);
            occurrencesMap.putIfAbsent(i, 1);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> integerEntry : occurrencesMap.entrySet()) {
            result += Math.floorDiv(integerEntry.getValue(), 2);
        }
        return result;
    }
}
