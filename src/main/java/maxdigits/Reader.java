package maxdigits;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    private static long scanUserInput() {
        System.out.println("Please enter your number :");
        Scanner reader = new Scanner(System.in);
        long number = reader.nextLong();
        reader.close();
        return number;
    }

    private static String numberToString(long number) {
        return String.valueOf(number);
    }

    public static ArrayList<Integer> generateDigits() {

        String number = numberToString(scanUserInput());

        int lengthOfNumber = number.length();

        ArrayList<Integer> listOfDigits = new ArrayList<Integer>();
        for (int i = 0; i < lengthOfNumber; i++) {
            listOfDigits.add(Character.getNumericValue(number.charAt(i)));
        }
        return listOfDigits;
    }


}
