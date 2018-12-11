import java.util.*;
public class dc {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        String l = ("a");
        String la = ("b");
        String p = ("c");
        String o = ("d");
        a.add(l);
        a.add(la);
        a.add(p);
        a.add(o);
        List b = a.subList(0,3);
        Collections.sort(b);
        Collections.shuffle(b);
        System.out.println(a);
        System.out.println(b);
    }
}
