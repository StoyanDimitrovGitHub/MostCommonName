package Utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MostCommonName {

    public static   String mostCommonName(List<String> names) {
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String name : names) {
            freq.put(name, freq.getOrDefault(name, 0) + 1);

        }
        String mostCommonName = null;
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                mostCommonName = entry.getKey();
                maxFreq = entry.getValue();
            }
        }
        return mostCommonName;
    }
}
