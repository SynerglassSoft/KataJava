package romanNumerals;

public class RomanToArabicNumberConvertor {
    public static int convertRomanNumberToArabicNumber(String romanNumber) {
        char[] allCharacter = romanNumber.toCharArray();
        int arabicNumber = 0;
        int convertedChar;
        for (int i = 0; i < allCharacter.length; i++) {
            convertedChar = convertRomanCharacterToArabicDigit(allCharacter[i]);
            if (i+1 < allCharacter.length && convertedChar < convertRomanCharacterToArabicDigit(allCharacter[i+1])){
                arabicNumber += convertRomanCharacterToArabicDigit(allCharacter[i+1])-convertedChar;
                i++;
            }else{
                arabicNumber += convertedChar;
            }
        }
        return arabicNumber;
    }

    private static int convertRomanCharacterToArabicDigit(char romanCharacter){
        switch (romanCharacter){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
