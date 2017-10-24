package maxdigits;


import java.util.ArrayList;


public class Comparator {

    public static String compareAndBuildMax() {
        String answer = "";
        ArrayList<Integer> listOfNumbers = Reader.generateDigits();
        final int size = listOfNumbers.size();
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < listOfNumbers.size(); j++) {
                if (listOfNumbers.get(j) > max) {
                    max = listOfNumbers.get(j);
                    maxIndex = j;
                }
            }
            listOfNumbers.remove(maxIndex);
            answer = answer + max;
            max = 0;
        }
        System.out.println("The MAX number from digits of your input is : " + answer);
        return answer;
    }

}
