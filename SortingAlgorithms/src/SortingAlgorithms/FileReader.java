package SortingAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

class FileReader {
    void readFile (int[] array) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("arrays/" + array.length + ".txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i = 0;
        while (Objects.requireNonNull(scanner).hasNextLine()) {
            array[i] = scanner.nextInt();
            i++;
        }

    }

}
