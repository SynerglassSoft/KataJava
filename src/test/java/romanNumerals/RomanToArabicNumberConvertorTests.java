package romanNumerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//But : Convertir un chiffre romain en chiffre arabe (1, 2, 3, 4, ...)

public class RomanToArabicNumberConvertorTests {
    @Test
    void shouldConvertRomanNumberToArabicOneToNine(){
        assertEquals(1, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("I"));
        assertEquals(2, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("II"));
        assertEquals(3, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("III"));
        assertEquals(4, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("IV"));
        assertEquals(5, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("V"));
        assertEquals(6, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("VI"));
        assertEquals(7, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("VII"));
        assertEquals(8, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("VIII"));
        assertEquals(9, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("IX"));
    }
    @Test
    void shouldConvertRomanNumberToArabicTenToNinety(){
        assertEquals(10, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("X"));
        assertEquals(20, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("XX"));
        assertEquals(30, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("XXX"));
        assertEquals(40, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("XL"));
        assertEquals(50, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("L"));
        assertEquals(60, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("LX"));
        assertEquals(70, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("LXX"));
        assertEquals(80, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("LXXX"));
        assertEquals(90, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("XC"));
    }
    @Test
    void shouldConvertRomanNumberToArabicHundredToNineHundred(){
        assertEquals(100, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("C"));
        assertEquals(200, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("CC"));
        assertEquals(300, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("CCC"));
        assertEquals(400, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("CD"));
        assertEquals(500, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("D"));
        assertEquals(600, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("DC"));
        assertEquals(700, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("DCC"));
        assertEquals(800, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("DCCC"));
        assertEquals(900, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("CM"));
    }

    @Test
    void shouldConvertRomanNumberToArabicNumberThousand(){
        assertEquals(1000, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("M"));
        assertEquals(2000, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("MM"));
        assertEquals(3000, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("MMM"));
        assertEquals(4000, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("MMMM"));
    }

    @Test
    void shouldConvertRomanNumberToArabicNumber(){
        assertEquals(47, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("XLVII"));
        assertEquals(99, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("XCIX"));
        assertEquals(1990, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("MCMXC"));
        assertEquals(2008, RomanToArabicNumberConvertor.convertRomanNumberToArabicNumber("MMVIII"));
    }
}
