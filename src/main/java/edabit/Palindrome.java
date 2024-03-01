package edabit;

public class Palindrome {
    public static String createMinimalPalindrome(String word) {
        String reverseWord = reverseWord(word);
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i).equals(reverseWord.substring(0, reverseWord.length()-i))){
                return word+reverseWord.substring(reverseWord.length()-i);
            }
        }
        return "";
    }

    private static String reverseWord(String word){
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
}
