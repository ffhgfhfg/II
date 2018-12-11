import java.util.*;
public class iau {
    iau(){
        System.out.println("w");
    }
    static ArrayList m = new ArrayList();
    static int p[] ={1,2,3};
    public static void main(String[] args){
    m.add(new iau());
    m.addAll(Arrays.asList(p));
    Collections.addAll(m, 3);
    System.out.println(m.size());
    int x = 1;
   System.out.println(m);

    }
}
