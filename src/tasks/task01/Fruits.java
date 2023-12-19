package tasks.task01;

import java.util.HashMap;
import java.util.Map;

public class Fruits {

    public static void main(String[] args) {

        System.out.println("\n\u2714\uFE0F Initial data:");
        getOutput(getInitialData());

        System.out.println("\n\u267B\uFE0F Updated data:");
        getOutput(getUpdatedData((getInitialData())));
    }

    private static Map<String, String> getInitialData() {
        Map<String, String> map = new HashMap<>();
        map.put("orange", "12 kg");
        map.put("banana", "25 kg");
        map.put("lemon", "8 kg");
        map.put("pineapple", "13 kg");
        map.put("grape", "9 kg");
        return map;
    }

    private static Map<String, String> getUpdatedData(Map<String, String> map) {
        map.put("plum", "15 kg");
        return map;
    }

    private static void getOutput(Map<String, String> map) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            count++;
            System.out.println(count + ") " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
