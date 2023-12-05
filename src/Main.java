import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Grad> list = new ArrayList<>();
        Grad g1 = new Grad(1, "Ayuj", 2023, 20000);
        Grad g2 = new Grad(2,"A", 2020, 20000);
        Grad g3 = new Grad(3, "B", 2021, 21000);
        Grad g4 = new Grad(4,"C", 2022, 21000);
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        Map<Integer, List<Grad>> groupMap = new LinkedHashMap<>();
        for(Grad grad: list){
            if(groupMap.containsKey(grad.salary)){
                groupMap.get(grad.salary).add(grad);
            } else {
                groupMap.put(grad.salary, new ArrayList<>(Arrays.asList(grad)));
            }
        }
        for(Map.Entry<Integer, List<Grad>> e: groupMap.entrySet()){
            System.out.println(e.getKey());
            for(Grad g: e.getValue()){
                System.out.println(g.name);
            }
        }
    }
}
