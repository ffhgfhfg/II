public class proxy {
    void http (proxy a) {}
    void socks (proxy a){}
}

class terminal extends proxy {

    public void http (terminal m) {
        System.out.println("u chose the http proxy.");
    }

    public void socks (terminal m) {
        System.out.println("u chose the socks proxy.");

    }
}

class computer {
    String s;
    public computer(String s) {
        this.s = s;
        System.out.println(s  + " is working now." );
    }
}

class server extends proxy{

    public void http (computer o) {
        System.out.println("u connected to the server.");
        System.out.println("now u can browse blocked sites.");

    }

    public void socks (computer o) {
        System.out.println("Connected to the proxy server.");

    }
}



class run {
    public static void main(String[] args) {
        computer b = new computer ("ffhgfhfg's Macbookpro");
        server k = new server ();
        k.socks(b);

    }
}