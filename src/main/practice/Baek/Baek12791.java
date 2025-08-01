import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baek12791 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("1967 DavidBowie");
        list.add("1969 SpaceOddity");
        list.add("1970 TheManWhoSoldTheWorld");
        list.add("1971 HunkyDory");
        list.add("1972 TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
        list.add("1973 AladdinSane");
        list.add("1973 PinUps");
        list.add("1974 DiamondDogs");
        list.add("1975 YoungAmericans");
        list.add("1976 StationToStation");
        list.add("1977 Low");
        list.add("1977 Heroes");
        list.add("1979 Lodger");
        list.add("1980 ScaryMonstersAndSuperCreeps");
        list.add("1983 LetsDance");
        list.add("1984 Tonight");
        list.add("1987 NeverLetMeDown");
        list.add("1993 BlackTieWhiteNoise");
        list.add("1995 1.Outside");
        list.add("1997 Earthling");
        list.add("1999 Hours");
        list.add("2002 Heathen");
        list.add("2003 Reality");
        list.add("2013 TheNextDay");
        list.add("2016 BlackStar");

        int a =s.nextInt();

        for (int i = 0; i < a; i++) {

            List<String> list2 = new ArrayList<>();
            int b = s.nextInt();
            int c = s.nextInt();

            for (int j = 0; j < list.size(); j++) {
                int year = Integer.parseInt(list.get(j).substring(0,4));

                if (year > c){
                    break;
                }
                if (year >= b){
                    list2.add(list.get(j));
                }
            }

            System.out.println(list2.size());

            for (int j = 0; j < list2.size(); j++) {
                System.out.println(list2.get(j));
            }
        }
    }
}
