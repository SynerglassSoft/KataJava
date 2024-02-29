package romanNumerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//But : Convertir un chiffre arabe (1, 2, 3, 4, ...) en chiffre romain

public class ArabicToRomanNumberConvertorTests {

    @Test
    void shouldConvertArabicNumberToRomanNumberOneToNine(){
        assertEquals("I", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(1));
        assertEquals("II", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(2));
        assertEquals("III", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(3));
        assertEquals("IV", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(4));
        assertEquals("V", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(5));
        assertEquals("VI", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(6));
        assertEquals("VII", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(7));
        assertEquals("VIII", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(8));
        assertEquals("IX", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(9));
    }

    @Test
    void shouldConvertArabicNumberToRomanNumberTenToNinety(){
        assertEquals("X", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(10));
        assertEquals("XX", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(20));
        assertEquals("XXX", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(30));
        assertEquals("XL", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(40));
        assertEquals("L", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(50));
        assertEquals("LX", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(60));
        assertEquals("LXX", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(70));
        assertEquals("LXXX", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(80));
        assertEquals("XC", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(90));
    }

    @Test
    void shouldConvertArabicNumberToRomanNumberHundredToNineHundred(){
        assertEquals("C", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(100));
        assertEquals("CC", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(200));
        assertEquals("CCC", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(300));
        assertEquals("CD", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(400));
        assertEquals("D", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(500));
        assertEquals("DC", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(600));
        assertEquals("DCC", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(700));
        assertEquals("DCCC", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(800));
        assertEquals("CM", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(900));
    }
    @Test
    void shouldConvertArabicNumberToRomanNumberThousand(){
        assertEquals("M", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(1000));
        assertEquals("MM", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(2000));
        assertEquals("MMM", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(3000));
        assertEquals("MMMM", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(4000));
    }

    @Test
    void shouldConvertArabicNumberToRomanNumber(){
        assertEquals("XLVII", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(47));
        assertEquals("XCIX", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(99));
        assertEquals("MCMXC", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(1990));
        assertEquals("MMVIII", ArabicToRomanNumberConvertor.convertArabicNumberToRomanNumber(2008));
    }
}
