package tasks.task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Products {

    public static void main(String[] args) {

        System.out.println("\n\u260E\uFE0F Welcome to the \"Everything for Phone\" " +
                "store \u260E\uFE0F");
        getOutput(getResultData(searchData(), getInitialData()));
    }

    private static Map<String, String> getInitialData() {
        Map<String, String> map = new HashMap<>();
        map.put("phone", "8");
        map.put("watch", "9");
        map.put("case", "5");
        map.put("power bank", "2");
        map.put("charger", "8");
        return map;
    }

    private static String searchData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\uD83D\uDED2 Enter the name of the required product: ");
        return scanner.nextLine().trim().toLowerCase();
    }

    private static String getResultData(String code, Map<String, String> map) {
        boolean hasContain = map.containsKey(code);
        if (hasContain) {
            String name = map.get(code);
                return "\n\u2714\uFE0F There are " + name +
                        " " + code + "s in stock." ;
        } else
            return "\n\u2757 Product " + code + " is out of stock \u2757";
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
