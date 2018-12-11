import java.util.*;
public interface music {
    void listen();
}

class popmusic implements music{
    popmusic(){
        System.out.println("popmusic");

    }

    public void listen(){
        System.out.println("a pop song");

    }
}

class absolutemusic implements music{
    public void listen(){
        System.out.println("an absolutemusic song");

    }
}

class abc{
    static Collection<music> a = new ArrayList<music> ();

    public static void main(String[] args) {
        a.add(new popmusic());
       System.out.println(a.size());
    }
}

