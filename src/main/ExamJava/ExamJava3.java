public class ExamJava3 {

    public static class Parent{
        public int cal(int a, int b){
            return a+b;
        }
    }

    public static class Kids extends Parent {
        @Override
        public int cal(int a, int b){
            return a*b;
        }
    }


    public static void main(String[] args) {
        Parent a = new Parent();
        Parent b = new Kids();

        System.out.println(a.cal(3,4));
        System.out.println(b.cal(3,4));
    }
}
