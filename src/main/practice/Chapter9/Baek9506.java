import java.util.ArrayList;
import java.util.Scanner;

    public class Baek9506 {                                 //완전수 구하기
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            while (true) {                                  //계속 반복할거라서 while문 사용
                int a = s.nextInt();
                ArrayList<Integer> arr = new ArrayList<>(); //정수형 리스트 arr 생성
                int hap = 0;
                for (int i = 1; i < a; i++) {               //반복문으로 a를 제외한 a의 약수를 리스트에 넣음
                    if (a % i == 0) {
                        arr.add(i);
                    }
                }
                for (int i = 0; i < arr.size(); i++) {      //a의 약수 hap에다가 더함
                    hap += arr.get(i);
                }
                if (hap == a) {                             //a의 약수의 합이 a와 같을경우 출력
                    System.out.print(a + " = ");
                    for (int i = 0; i < arr.size() - 1; i++) {
                        System.out.print(arr.get(i) + " + ");
                    }
                    System.out.println(arr.get(arr.size() - 1));
                }
                else if(a == -1) {                          //-1 입력시 while문 종료
                    break;
                }
                else {                                      //a가 완전수가 아닐 시 출력
                    System.out.println(a + " is NOT perfect.");
                }
            }
        }
    }

