package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/31/15.
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileParser {

    public static ArrayList<ArrayList<String>> getLines(String filename, int columnNumber) {
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String[] nextLine = scanner.nextLine().split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                if (nextLine.length != 18) {
                    continue;
                }
                if (!nextLine[columnNumber].equals("")) {
                    lines.add(new ArrayList(Arrays.asList(nextLine)));
                }
            }
        } catch (IOException exception) {
            System.err.println("IO exception: " + exception + ": " + filename);
            return null;
        }
        return lines;
    }
}