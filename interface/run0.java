class c{
    c(){
        System.out.println("c");

    };
}

class a {
    static class b{
        b(){System.out.println("s");
        }
        c m (){
            return new c();
        }

        public static void main(String[] args) {
            b oo = new b();
        }
    }

}