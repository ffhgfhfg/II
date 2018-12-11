package ll.src;
class useful {
    useful() {}
        void add () {
        System.out.println("useful");

        }
    }


class moreuseful extends useful{
    moreuseful() {
    }

    void add () {
System.out.println("more useful");
    }
}

 class out {
   static useful a [] ={
            new useful(),
        new moreuseful()
    };

     public static void main(String[] args) {
         a[0].add();
         a[1].add();
     }
    }

