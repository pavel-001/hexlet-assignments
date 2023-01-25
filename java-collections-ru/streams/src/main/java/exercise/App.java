package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> list) {
        return Math.toIntExact(list.stream()
                .filter(y -> y.endsWith("@gmail.com") || y.endsWith("@yandex.ru") || y.endsWith("@hotmail.com"))
                .count());
    }
}
// END
