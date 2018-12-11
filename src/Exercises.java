package ll.src;
//包的导入
import java.util.*;
public class Exercises {
    public static void main(String[] args) {
        System.out.println(new Date());
    }
}

//构造器
class cat{
    cat() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        cat k = new cat();
    }
}

//带参数的继承
class cafe{
    cafe(int x) {
        System.out.println("u bought a cup of coffee.");
    }
}

class latte extends cafe {
    latte() {
        super(1);
        System.out.println("u chose the latte.");

    }

    public static void main(String[] args) {
        latte a = new latte();
    }
}

class nu{
    //a program that print number 1-10
    public static void main(String[] args) {
        for (int b = 1; b < 11; b++) {
            System.out.print(" " +b);
        }
    }
}

//switch语句
class zim{
    public static void main(String[] args) {
        int s; int j; char q= 'a';
        Random kk = new Random();
        s = kk.nextInt(26);
        j = s + q;
       switch(j) {
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u': System.out.println((char)j + " :" + "元音字母");
           break;

           case 'y':
           case 'w': System.out.println((char)j + " :" + "有时为元音字母");
           break;

           default: System.out.println((char)j + " :" + "普通字母");
       }
    }
}

//this 用法1
class oo{
    Random zl = new Random();
    int m;
    oo(int m) {
     this.m = m;
      System.out.println("你的点数： " + m);

    }
    public static void main(String[] args) {
        oo h = new oo(8);

    }

}

//this 用法2
class flower{

    flower() {
        this(1);
        System.out.println("Ahh,it's a rose.");
    }

    flower(int t){

        System.out.println("u found a flower.");
    }

    public static void main(String[] args) {

        flower q = new flower();

    }
}


class qa{
    int i = 0;
    qa() {
        System.out.println("ssa");
    }

    void as() {
        System.out.println("Hello~");
    }
    public static void main(String[] args) {
        qa ai = new qa();
        ai.as();
    }
}

//this用法3
class o {
    int j = 0;
    o hu() {
        j++;
        return this;
    }
o () {
        System.out.println("a");

}

void print () {
        System.out.println("j = " + j);

}
    public static void main(String[] args) {
    o ju = new o ();
    ju.hu().hu().print();
    }
}
