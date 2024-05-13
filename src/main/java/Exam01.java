class Car{
    private int speed;
    private  String color;

    void setCar(int speed, String color){
        this.speed = speed;
        this.color = color;
    }
    public int getspeed(){
        return this.speed;
    }
    public String getColor(){
        return this.color;
    }
    Car(int speed){
        this.speed = speed;
    }

}

public class Exam01{
    public static void main(String[] args) {
        Car car = new Car(100);
        car.setCar(200,"빨간색");
        System.out.println(car.getspeed() + car.getColor());
    }
}
