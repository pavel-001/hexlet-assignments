package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App{
    public static Map getWordCount(String text) {
        Map<String, Integer> map = new HashMap<>();
        if (!text.equals("")) {
            for (String s : text.split(" ")) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        StringBuilder result = new StringBuilder();
        result.append("{");
        System.out.println(map);
        if (map.size() != 0) {
            result.append("\n");
            for (String s : map.keySet()) {
                result.append("  ");
                result.append(s);
                result.append(": ");
                result.append(map.get(s));
                result.append("\n");
            }
        }
        result.append("}");
        System.out.println(map.size());
        return result.toString();
    }
}
//END
