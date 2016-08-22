package stringcount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by harshita on 21/8/16.
 */
public class StrCnt {


    public static void main(String[] args) {

        String text=new String("Hello, my name is Harshita Yeole. I am a Software Engineer. I work in Equal Experts. Equal Experts is an excellent company. Equal experts and I would have a long way ahead. I am a Software Engineer.");
        int countOfWords=2;


        StrCnt.findstr(text,countOfWords);

    }

    private static void findstr(String text, int countOfWords) {


        String delimiters = "\\;|\\.|\\,|\\s|\\:|\\!";

        Map<String,Integer> m = new HashMap<>();
        String[] splitstr=text.split(delimiters);

        System.out.println(Arrays.toString(splitstr));
        for (String key:splitstr) {

            if (m.containsKey(key))
            {
                Integer frequency=m.get(key);
                m.put(key,frequency+1);

            }
            else {
                m.put(key,1);
            }

        }
        System.out.println(m);
        System.out.println();
        for (Map.Entry<String,Integer> entry:m.entrySet()) {

            System.out.println(entry.getKey()  +"  : "+ entry.getValue());

        }



    }
}
