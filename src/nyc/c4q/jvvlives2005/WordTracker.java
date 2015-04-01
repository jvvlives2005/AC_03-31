package nyc.c4q.jvvlives2005;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Scanner;
/**
 * Created by c4q-joshelynvivas on 3/31/15.
 */
public class WordTracker {
    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me some words: ");
        while (true){
            String newWord = input.nextLine();
            if (newWord.equals("stop")){
                break;
            }
            else if (newWord.equals("rm")){
                words.remove(" ");
            }
            else if (newWord.equals("add")){
                boolean addMode;
            }
            else if (newWord.equals("clr")){
                words.clear();
            }

            if(words.get(newWord) == null) {
                words.put(newWord, 1);
            }
            else{
                int count = words.get(newWord);
                words.put(newWord, count + 1);
            }


        }

        System.out.println("Here they are: ");
        for(String newWords2 : words.keySet()){

            Integer j = words.get(newWords2);      //give Integer value

            System.out.println(newWords2 + ": " + j);


        }


         System.out.println("Thanks! You have given me " + words.size() + " word(s)");







    }
}
