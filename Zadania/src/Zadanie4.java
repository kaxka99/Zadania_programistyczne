//Napisz program zapamiętujący zmienną liczbę string’ów, a następnie usuwający losowe z nich.
//Wyświetl na konsolę dane przed i po operacji

import java.lang.Math;
import java.util.ArrayList;

public class Zadanie4 {
    public static void main(String[] args) {
        ArrayList<String> demo = new ArrayList<>();
        demo.add("Przykład 1");
        demo.add("Przykład 2");
        demo.add("Przykład 3");
        demo.add("Przykład 4");
        demo.add("Przykład 5");
        demo.add("Przykład 6");
        demo.add("Przykład 7");
        demo.add("Przykład 8");
        System.out.println("Dane przed operacją: " + demo);
        System.out.println("Dane po operacji: " + deleteRandomStringFromStringsArrayList(demo));
    }

    public static ArrayList<String> deleteRandomStringFromStringsArrayList(ArrayList<String> inputArray) {

        for ( int i = 0; i < inputArray.size(); i++) {
            int randomNumber = getRandomNumber();
            if( randomNumber > 0 ) {
                inputArray.remove(i);
            }
        }
        return inputArray;
    }

    public static int getRandomNumber() {
        return (int) Math.round(Math.random());
    }
}
