import ll.src.*;
public interface book {
    void read ();
}

class story implements book {
   public void read () {
        System.out.println("u browsed the story book.");
    }
}



class learn {
   public void read () {
        System.out.println("u can learn many things through reading.");
    }
}

class human extends learn{
 human () {
        System.out.println("Human should learn things.");
    }
    void readstory (story x) {x.read();}
}

class ru{
    public static void main(String[] args) {
        human a = new human();
        story b = new story();
        a.read();
        a.readstory(b);
        subject c = new subject(2);
    }
}