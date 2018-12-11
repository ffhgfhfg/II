public interface pen {
    void write();
}

interface penfactory{
    pen p();
}

class pencil implements pen {
    pencil() {}
    public void write() {
        System.out.println("u wrote 'kl' with a pencil.");
    }
    static penfactory factory = new penfactory(){
        public pen p(){
            return new pencil();
        }
    };

    }


class inkpen implements pen {
    inkpen() {}
    public void write() {
         System.out.println("u wrote 'sa' with a inkpen.");
 }

    static penfactory factory = new penfactory(){
        public pen p(){
            return new inkpen();
        }
    };
}

class pfactory{
    public static void qfactory(penfactory x){
        pen a = x.p();
        a.write();
    }

    public static void main(String[] args) {
        qfactory(inkpen.factory);
    }
}
