package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class VerifyingAnAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {

        String[] wordsCopy = Arrays.copyOf(words, words.length);

        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int comp1 = o1.compareTo(order);
                int comp2 = o2.compareTo(order);
                int compWords = o1.compareTo(o2);


                if (comp1 > comp2) { //4 -7 4//-5 -21 -5 //10 -9 9
                    return 1;
                } else if (comp1 == comp2) { //-1 vs 6
                    if(compWords>0){
                        return 1;
                    } else return -1;
                }
              else if(compWords<comp1){
                  if(comp1+comp2>0){
                 if(order.indexOf(o1.charAt(0))>order.indexOf(o2.charAt(0))) {
            return 1;
                      } else
                      return -1;
                  } else return 1; //  (-7 < -1 comp2 6 )
                } else return -1; // world
            }
        };

        Arrays.sort(words, myComp);

        return Arrays.compare(words, wordsCopy) == 0;

    }

    public static void main(String[] args) {

        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        String[] words1 = {"word", "world", "row"};
        String order1 = "worldabcefghijkmnpqstuvxyz";

        String[] words3 = {"apple", "app"};
        String order3 = "abcdefghijklmnopqrstuvwxyz";

        String[] words2 = {"ubg", "kwh"};
        String order2 = "qcipyamwvdjtesbghlorufnkzx";

        String[] words4 = {"my", "f"};
        String order4 = "gelyriwxzdupkjctbfnqmsavho";

        String[] words5 = {"rb", "fe"};
        String order5 = "kyxopjzluebdsrfgtinhcaqwvm";

        String[] words6 = {"kxvyx","ts"};
        String order6 = "tiwjpbemkhalsqzdvucorfgxyn";


      new VerifyingAnAlienDictionary().isAlienSorted(words, order);
     new VerifyingAnAlienDictionary().isAlienSorted(words1, order1);
     new VerifyingAnAlienDictionary().isAlienSorted(words3, order3);
      new VerifyingAnAlienDictionary().isAlienSorted(words2, order2);
      new VerifyingAnAlienDictionary().isAlienSorted(words4, order4);
   //   new VerifyingAnAlienDictionary().isAlienSorted(words5, order5);
      new VerifyingAnAlienDictionary().isAlienSorted(words6, order6);

    }

}
