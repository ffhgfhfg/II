import java.util.*;
public class aqz {
    public static void main(String[] args) {
        String[] fruit = {"apple", "watermelon", "banana", "orange", "lemon"};
        String[] meat = {"chicken", "pork", "fish", "duck"};
        List<String> a = Arrays.asList(fruit);
        List<String> b = Arrays.asList(meat);
        List d = new ArrayList();
        d.add("peanut");
        d.add("egg");
        d.add(Arrays.asList(fruit));
        System.out.println(d);
        Collection c = new ArrayList();
        Collections.addAll(c, a, b);
        Iterator m = d.iterator();
        while(m.hasNext()){
            m.next();
            m.remove();
        }
        System.out.println(d);
    }
}
