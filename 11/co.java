import java.util.*;
public class co {
    public static void main(String[] args) {
        Collection<String> a = new ArrayList<String>();
        String b = ("dog");
        String c = ("cat");
        String d = ("tiger");
        Collections.addAll(a, b, c, d);
        System.out.println(a);
        ArrayList e = new ArrayList();
        e.add(b); e.add(c); e.add(d);
        System.out.println(e.subList(1,2));
    }
}


