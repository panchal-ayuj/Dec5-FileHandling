import java.util.*;

public class HashMapSorting {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"S");
        map.put(5,"M");
        map.put(2,"T");
        System.out.println(map);
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterableList = entries.iterator();
        List<Map.Entry<Integer, String>> list = new ArrayList<>();
        while (iterableList.hasNext()){
            list.add(iterableList.next());
        }
        Collections.sort(list, (x,y)->x.getValue().compareTo(y.getValue()));
        Map outputMap = new LinkedHashMap();
        for (Map.Entry<Integer, String> entry:list){
            outputMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println(outputMap);
    }
}
