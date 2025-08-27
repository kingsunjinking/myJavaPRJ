import java.util.Scanner;

public class Baek3054 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();

        char[][] arr = new char[5][5+(a.length()-1)*4];

        for (int i = 0; i < 5; i++) {

            int cnt = 0;

            if(i == 0 || i == 4){
                for (int j = 0; j < 5+(a.length()-1)*4; j++) {
                    if(j == 2){
                        arr[i][j] = '#';
                        cnt++;
                    }
                    else if(cnt == 2 && j % 4 == 2){
                        arr[i][j] = '*';
                        cnt = 0;
                    }else if(j % 4 == 2){
                        arr[i][j] = '#';
                        cnt++;
                    }else {
                        arr[i][j] = '.';
                    }
                }
            }
            if(i == 1 || i == 3){
                for (int j = 0; j < 5+(a.length()-1)*4; j++) {
                    if(j % 2 == 1 && cnt >= 4){
                        arr[i][j] = '*';
                        if(cnt == 4){
                            cnt++;
                        }else{
                            cnt=0;
                        }
                    }else if(j % 2 == 1){
                        arr[i][j] = '#';
                        cnt++;
                    }else{
                        arr[i][j] = '.';
                    }
                }
            }
            if(i == 2){
                for (int j = 0; j < 5+(a.length()-1)*4; j++) {
                    if(cnt == 2 && j == 4+(a.length()-1)*4){
                        arr[i][j] = '#';
                    }
                    else if(j % 2 == 1){
                        arr[i][j] = '.';
                    }else{
                        if(j % 4 == 2){
                            arr[i][j] = a.charAt(j/4);
                        }else if (cnt >= 2){
                            arr[i][j] = '*';
                            if(cnt == 2) {
                                cnt++;
                            }else{
                                cnt = 1;
                            }
                        }else{
                            arr[i][j] = '#';
                            cnt++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5+(a.length()-1)*4; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
