class father{
    public int a (){
        return 9;
    }
}

class mother{
    public int b(){
        return 10;
    }
}

class son {
    class fathera extends father{
 public int a (){
     return super.a() - 2;
 }
    }

    class mothera extends mother{
 public int b(){
            return super.b() - 2;
        }
    }

    int c(){
        return new fathera().a();
    }

    int d(){
        return new mothera().b();
    }
}

class runo{
    public static void main(String[] args) {
        son i = new son();
        System.out.println(i.d());

    }
}