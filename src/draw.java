package ll.src;
class shape {
shape () {}
void draw () {System.out.println("u drew a unknown shape.");
 }
}

class circle extends shape {
    circle() {}
    void draw () {System.out.println("u drew a circle.");}
        }

class triangle extends shape {
    triangle() {}
    void draw () {System.out.println("u drew a triangle."); }
}

 class rectangle extends shape {
    rectangle () {}
    void draw () {System.out.println("u drew a rectangle.");
    }
}

class square extends rectangle {
    int x = 1;
    int y = x;
    square () {}
    void draw () {System.out.println("u drew a square.");}
    void erase (int x) {
        this.x = x;
        if (y == x) {
            System.out.println("u erased the square.");
        }

        }


 }

 public class draw {
     public static void main(String[] args) {
         shape a = new square ();
         square b = new square ();
         a.draw();
         b.erase(1);
     }
    
 }