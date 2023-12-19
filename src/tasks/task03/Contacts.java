package tasks.task03;

import java.util.LinkedHashMap;
import java.util.Map;

public class Contacts {

    public static void main(String[] args) {

        System.out.println("\n\u2714\uFE0F Initial contacts:");
        getOutput(getInitialContacts());

        System.out.println("\n\u267B\uFE0F Updated contacts:");
        getOutput(updateContacts(getInitialContacts()));
    }

    private static Map<String, String> getInitialContacts() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Tom", "tom@mail.com");
        map.put("Lisa", "lisa@mail.com");
        map.put("Alice", "alisa@mail.com");
        map.put("Denis", "den@mail.com");
        return map;
    }

    private static Map<String, String> updateContacts(Map<String, String> map) {
        map.replace("Tom", "tomasdev@glob.net");
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
