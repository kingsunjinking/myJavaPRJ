public class Code11_06 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30};

        try {
            arr[3] = 1234;
        }
        catch (Exception e){
            System.out.println("오류 발생!");
        }
    }
}
