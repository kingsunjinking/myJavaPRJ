import java.util.ArrayList;
import java.util.List;

public class Create_Hamburger {
        public static int solution(int[] ingredient) {
            List<Integer> list = new ArrayList<>();
            int answer = 0;

            for(int i = 0; i < ingredient.length; i++){
                list.add(ingredient[i]);
                if(list.size() >= 4
                        &&list.get(list.size()-4)==1
                        &&list.get(list.size()-3)==2
                        &&list.get(list.size()-2)==3
                        &&list.get(list.size()-1)==1){
                    answer++;
                    for(int j = 0 ; j < 4; j++){
                        list.remove(list.size()-1);
                    }
                }
            }
            return answer;
        }

    public static void main(String[] args) {
        int [] arr = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int k = solution(arr);
        System.out.println(k);
    }
}

