package runtests;
import java.io.File;
import sorting.SortingLines;

public class CollectionRunner {
    public static void main(String[] args){
        File file = new File("C:\\Users\\panchal.kumar\\IdeaProjects\\Dec5-FindHandling\\src\\source.txt");
        SortingLines.sortFileByLength(file);
    }
}
