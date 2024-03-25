public class CharAtPractice {
    public static void main(String[] args){
        String str = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 \"http://www.example.com/start.html\" \"Mozilla/4.08 [en] (Win98; I ;Nav)\"";
        int a=str.indexOf(" ");
        System.out.println(str.substring(0,a).trim());

        int b=str.indexOf("\"");
        int x=str.indexOf(" ",b);
                System.out.println(str.substring(b+1,x));
    }
}
