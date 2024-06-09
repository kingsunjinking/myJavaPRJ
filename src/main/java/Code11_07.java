public class Code11_07 {
    public static void main(String[] args) {

        int [] arr = {10,20,30};

        try {
            arr[3] = 1234/0;
            arr[3] = 1234;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자 오류");
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나눠서 오류");
        }
        finally {
            System.out.println("무조건 보이는 부분");
        }
    }
}
