public class Code04_13 {
    public static void main(String[] args){
        String str ="        한글    ABCD     efgh";
        String cutStr = "";

        cutStr = str.trim();
        String var1, var2;

                var1 = str.toUpperCase();
                var2 = cutStr.toLowerCase();

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("공백 제거 ==> [" + cutStr + "]");
        System.out.println("기존 문자열 대문자로 바꾼거 ==> [" + var1 + "]");
        System.out.println("공백 제거 소문자로 바꾼거 ==> [" + var2 + "]");
    }
}
