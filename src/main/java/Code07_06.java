class Rabbit{
    String shape;
    int xPos;
    int yPos;
    Rabbit(String rabbitcolor) {
        shape = rabbitcolor;
    }

    void setPosition(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;

        System.out.println("xPos : " + xPos + " / ypos : " + yPos);
    }
}
public class Code07_06 {
    public static void main(String[] args) {

            Rabbit rabbit5 = new Rabbit("파란색");
        System.out.println(rabbit5.shape);
//        Rabbit rabbit1 = new Rabbit();
//        rabbit1.shape = "원";
//        rabbit1.setPosition(100,100);
//        Rabbit rabbit2 = new Rabbit();
//        rabbit2.shape = "삼각형";
//        rabbit2.setPosition(200,200);
//        Rabbit rabbit3 = new Rabbit();
//        rabbit3.shape = "토끼";
//        rabbit3.setPosition(300,300);
//        Rabbit rabbit4 = new Rabbit();

//        System.out.printf("토끼 객체의 기본모양은 [%s]입니다.\n",rabbit4.shape);
//        System.out.printf("토끼1 객체의 모양은 [%s]으로 지정했기 때문에 [%s]입니다.\n",rabbit1.shape,rabbit1.shape);
//        System.out.printf("토끼2 객체의 모양은 [%s]으로 지정했기 때문에 [%s]입니다.\n",rabbit2.shape,rabbit2.shape);
//        System.out.printf("토끼3 객체의 모양은 [%s]로 지정했기 때문에 [%s]입니다.\n",rabbit3.shape,rabbit3.shape);
    }
}
