class Rabbit9{
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit extends Rabbit9{
    String owner;
    int size;
    String feed;
    HouseRabbit(String owner){
        this.owner = owner;
    }

    void setSize(int size){
        this.size = size;
    }

    int getSize(){
        return this.size;
    }

    void setFeed(String feed){
        this.feed = feed;
    }

    String getFeed(){
        return this.feed;
    }
    void eat(){
        System.out.printf("%s의 집토끼가 %s을(를) 먹습니다 키는 %d 입니다.\n",this.owner,this.feed,this.size);
    }
}

public class Code08_02 {
    public static void main(String[] args) {

        HouseRabbit hb = new HouseRabbit("정선진");
        hb.setSize(100);
        hb.setFeed("커피");
        hb.eat();
    }
}