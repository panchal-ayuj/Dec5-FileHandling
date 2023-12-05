package sorting;

import io.FileReader;
import io.FileWriter;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingLines {
    public static void sortFileByLength(File file){
        List<String> lines = FileReader.readFile(file);
        lines = sortLine(lines);
        FileWriter.writeToFile(lines);
    }

    private static List<String> sortLine(List<String> lines) {
        Collections.sort(lines, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        return lines;
    }
}
