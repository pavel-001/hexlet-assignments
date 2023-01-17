package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App{
    public static boolean scrabble(String text, String words){
        List<String> wordsMod = new ArrayList<>(List.of(words.toLowerCase().split("")));
        System.out.println(wordsMod);
        String[] textMod = text.toLowerCase().split("");
        for (String s : textMod) {
            wordsMod.remove(s);
        }
        return wordsMod.size() == 0;
    }
}
//END
