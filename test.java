interface food {
    void method1();
    void method2();
}

interface foodfactory{
    food getfood();
}

class cake implements food{
    public void method1(){
        System.out.println("cake method1.");
    }

    public void method2(){
        System.out.println("cake method2.");
    }
}

class cakefactory implements foodfactory{
    public food getfood(){
        return new cake();
    }
}

class bread implements food{
    public void method1(){
        System.out.println("bread method1.");
    }

    public void method2(){
        System.out.println("bread method2.");
    }
}

class breadfactory implements foodfactory{
    public food getfood(){
        return new bread();
    }
}

class ffactories{
    public static void makefood(foodfactory x){
        food m = x.getfood();
        m.method1();
        m.method2();
    }

    public static void main(String[] args) {
        foodfactory l = new breadfactory();
        makefood(l);
    }
}
