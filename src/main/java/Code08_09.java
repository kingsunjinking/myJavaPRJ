interface girl{
    abstract void sleep();
}

class Housegirl implements girl{
    @Override
    public void sleep() {
        System.out.println("여자가 집에서 잠을 잡니다.");
    }
}
public class Code08_09 {
    public static void main(String[] args) {

        Housegirl sunjin = new Housegirl();
        sunjin.sleep();
    }
}
