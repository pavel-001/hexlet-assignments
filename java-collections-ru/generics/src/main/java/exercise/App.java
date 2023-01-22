package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> list, Map<String,String> map) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> m : list) {
            boolean flag = false;
            for (Map.Entry<String, String> e : map.entrySet()) {
                if (m.containsKey(e.getKey()) && m.containsValue(e.getValue())) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(m);
            }
        }
        return result;
    }
}
//END
