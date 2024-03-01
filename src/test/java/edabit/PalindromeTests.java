package edabit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTests {

    @Test
    void shouldAddMinLetterForBuildPalindrome(){
        assertEquals("bob", Palindrome.createMinimalPalindrome("bob"));
        assertEquals("madam", Palindrome.createMinimalPalindrome("mada"));
        assertEquals("racecar", Palindrome.createMinimalPalindrome("race"));
        assertEquals("mirrorrim", Palindrome.createMinimalPalindrome("mirror"));
        assertEquals("maam", Palindrome.createMinimalPalindrome("maa"));
    }
}
