package sorting;

public class LineItem implements Comparable<String> {
    String lineContent;
    @Override
    public int compareTo(String o){
        return o.length()-this.lineContent.length();
    }
}
