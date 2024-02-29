package reordering;

public class Reordering {

    public static char[] reorderArrayOfChar(char[] chars) {
        char tempChar;
        for (int j = 0; j < chars.length; j++) {
            for (int i = 0; i < chars.length-(j+1); i++) {
                if (chars[i] > chars[i+1]){
                    tempChar = chars[i];
                    chars[i] = chars[i+1];
                    chars[i+1] = tempChar;
                }
            }
        }
        return chars;
    }
}
