import java.util.*;
public interface game {
    void play (int a);

}

class chess implements game {
    chess () {
        System.out.println("u chose the chess game.");

    }
    public void play (int a) {
        System.out.println("u played " + a + " hours.");
    }

    public void arrangement () {
        System.out.println("u arranged the board.");

    }
}

class yugioh implements game {
    yugioh () {
        System.out.println("u chose the yugioh card.");

    }
    public void play (int a) {
        System.out.println("残りのカード：" + a + ".");
    }
    void trade () {
        int x;
        Random l = new Random();
        x = l.nextInt(50);
        if(x == 7) {
            System.out.println("手中已有五张'大法师'卡，赢得游戏。");}
            else {
                System.out.println("正在收集大法师卡。");

            }
        }
    }

class playgame {
 static game g [] = {new chess(), new yugioh()};

    public static void main(String[] args) {
        g[0].play(8);
        yugioh z = new yugioh ();
        z.play(27);
        z.trade();
    }
 }


