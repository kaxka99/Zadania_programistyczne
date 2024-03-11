import java.lang.Math;

public class Zadanie2 {
    public static void main(String[] args) {
        int size = 50;
        System.out.println(createRandomStrings(size));
    }

    public static String createRandomStrings(int size) {
        final char[] alphabet = {'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] randomCharArray = new char[size];

        for (int i = 0; i < size; i++) {
            int randomNumber = getRandomNumber(alphabet.length - 1);
            randomCharArray[i] = alphabet[randomNumber];
        }

        return new String(randomCharArray);
    }

    public static int getRandomNumber(int max) {
        int min = 0;
        return (int) ((Math.random() * (max - min)) + min);
    }
}
