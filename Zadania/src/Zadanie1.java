import java.util.ArrayList;

public class Zadanie1 {
    public static void main(String[] args) {
        int size = 10;

        // Array jest najlepszym wyborem kiedy znamy ilość liczb do przechowania, oraz nie będziemy
        // dodawać nowych lub usuwać istniejących elementów w tabeli
        int[] inputArrayKnownSize = {1,2,3,4};
        ArrayList<Integer> inputArrayList = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            inputArrayList.add(i);
        }

        inputArrayList.remove(6);

        // Iteracja pętlami for-each po elementach
        for (int i : inputArrayKnownSize) {
            System.out.println(i);
        }

        for (int i : inputArrayList) {
            System.out.println(i);
        }


    }
}
