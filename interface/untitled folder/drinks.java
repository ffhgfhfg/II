public interface drinks {
    void buy();
}

class coffee implements drinks {
   public void buy(){
        System.out.println("buy");
    }
    coffee () {
        System.out.println("coffee");
    }
}

class water implements drinks{
   public void buy(){
        System.out.println("buy2");
    }
    water() {
        System.out.println("water");
    }
}

class factory{
    drinks o (String name){
    if (name == "coffee"){
        return new coffee();
    }
    else if (name == "water"){
    return new water();
    }
    else {
        System.out.println("error");
    }
    return null;
}

}


    class test {
    public static void main(String[] args) {
      factory k = new factory();
      drinks l = k.o("water");
      l.buy();
    }

}