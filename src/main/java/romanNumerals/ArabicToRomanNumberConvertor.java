package romanNumerals;

public class ArabicToRomanNumberConvertor {

    public static String convertArabicNumberToRomanNumber(int arabicNumber) {
        return  convertArabicToRomanByThousand(getThousand(arabicNumber))+
                convertArabicNumberToRomanByPattern(getHundred(arabicNumber), new String[]{"C", "D", "M"})+
                convertArabicNumberToRomanByPattern(getDecade(arabicNumber), new String[]{"X", "L", "C"})+
                convertArabicNumberToRomanByPattern(getDigit(arabicNumber), new String[]{"I", "V", "X"});
    }

    private static String convertArabicNumberToRomanByPattern(int arabicNumber, String[] pattern){
        switch (arabicNumber){
            case 1: return pattern[0];
            case 2: return pattern[0]+pattern[0];
            case 3: return pattern[0]+pattern[0]+pattern[0];
            case 4: return pattern[0]+pattern[1];
            case 5: return pattern[1];
            case 6: return pattern[1]+pattern[0];
            case 7: return pattern[1]+pattern[0]+pattern[0];
            case 8: return pattern[1]+pattern[0]+pattern[0]+pattern[0];
            case 9: return pattern[0]+pattern[2];
        }
        return "";
    }

    private static String convertArabicToRomanByThousand(int numberOfThousand){
        StringBuilder thousand = new StringBuilder();
        for (int i = 0; i < numberOfThousand; i++) {
            thousand.append("M");
        }
        return thousand.toString();
    }

    private static int getDigit(int arabicNumber){
        return arabicNumber - ((arabicNumber/10)*10);
    }

    private static int getDecade(int arabicNumber){
        return getDigit(arabicNumber/10);
    }

    private static int getHundred(int arabicNumber){
        return getDigit(arabicNumber/100);
    }

    private static int getThousand(int arabicNumber){
        return arabicNumber/1000;
    }
}
