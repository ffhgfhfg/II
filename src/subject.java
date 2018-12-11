package ll.src;
import net.mindview.util.*;
public class subject {
    public subject(int x) {
        System.out.println("u learnt "+ x + " hours.");

    }
    public static void main(String[] args) {
        System.out.println();

    }
}

class math extends subject {
    math (int x) {
        super(7);
       System.out.println(x + " hours.");

    }
    public static void main(String[] args) {
        math book = new math(2);
    }
}