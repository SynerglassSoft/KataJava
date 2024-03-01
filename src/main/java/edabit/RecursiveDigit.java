package edabit;

public class RecursiveDigit {
    public static int superDigit(int number) {
        int analysedNumber = number;
        while(analysedNumber >10){
            analysedNumber = sumOfDigit(analysedNumber);
        }
        return analysedNumber;
    }
    public static int superDigit(String number) {
        int analysedNumber = 0;
        for (int i = 0; i < number.length(); i+=5) {
            analysedNumber += superDigit(Integer.parseInt(number.substring(i, i+5)));
        }

        return superDigit(analysedNumber);
    }

    private static int sumOfDigit(int number){
        int numberOfDigit = numberOfDigit(number);
        int sum = 0;
        for (int i = 0; i < numberOfDigit; i++) {
            sum += getDigit((int)(number/Math.pow(10, i)));
        }
        return sum;
    }

    private static int numberOfDigit(int number){
        return (int) Math.log10(number)+1;
    }

    private static int getDigit(int number){
        return number - ((number/10)*10);
    }
}
