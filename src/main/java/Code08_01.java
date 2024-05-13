class Rabbit8{
    String shape;
    int xPos;
    int yPos;
    static int count = 0;

    Rabbit8(){
        count++;
    }
}

public class Code08_01 {
    public static void main(String[] args) {
        System.out.println(Rabbit8.count);
        Rabbit8 rb = new Rabbit8();
        System.out.println(Rabbit8.count);
        Rabbit8 rb2 = new Rabbit8();
        System.out.println(Rabbit8.count);

    }
}
