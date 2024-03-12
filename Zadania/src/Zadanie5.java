//Wygeneruj zestaw losowych liczb z podanego zakresu. Następnie znajdź największą oraz
//najmniejszą spośród nich.

public class Zadanie5 {
    public static void main(String[] args) {
        int[] randomArray = generateRandomNumbersArray(10, 55, 10);
        System.out.println(findMin(randomArray));
        System.out.println(findMax(randomArray));
    }

    public static int[] generateRandomNumbersArray(int min, int max, int size) {
        int[] randomIntArray = new int[size];
        for ( int i = 0; i < size; i++ ) {
            randomIntArray[i] = getRandomNumber(min, max);
        }

        return randomIntArray;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] < min ) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] > max ) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
