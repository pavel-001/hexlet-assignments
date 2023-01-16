package exercise;

import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
class App{
    public static boolean scrabble(String text, String words){
        String wordsMod = words.toLowerCase();
        String result = "";
        String textMod = text.toLowerCase();
        for (int i = 0; i < words.length(); i++) {
            for (int j = textMod.length()-1; j >= 0 ; j--) {
                if (wordsMod.charAt(i) == textMod.charAt(j)) {
                    result += textMod.substring(j, j+1);
                    textMod = textMod.substring(0, j) + textMod.substring(j+1, textMod.length());
                    break;
                }
            }
        }
        return result.equals(wordsMod);
    }
}
//END
