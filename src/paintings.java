package ll.src;
public abstract class paintings {
    abstract void a ();
    void b () {};
}

class sketch extends paintings {
    void a () {
        System.out.println("You drew a sektch painting.");
    }

    void b () {
        System.out.println("It's beautiful.");
    }

}

class look{
    public static void main(String[] args) {
        paintings x = new sketch();
        x.a();
    }
}
