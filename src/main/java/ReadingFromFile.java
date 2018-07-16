import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {

    public static void main(String [] args) throws FileNotFoundException{

        File file = new File(pathname: "TestFile2");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] words = line.split(" ");

        System.out.println(Arrays.toString(words));
    }
}
