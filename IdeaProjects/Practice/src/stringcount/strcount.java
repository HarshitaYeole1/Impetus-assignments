package stringcount;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by harshita on 21/8/16.
 */
public class strcount {

    public static void main(String[] args) throws IOException {

        FileWriter f = new FileWriter("input.txt");
        f.append("Hello, my name is Harshita Yeole. I am a Software Engineer. I work in Equal Experts. Equal Experts is an excellent company. Equal experts and I would have a long way ahead. I am a Software Engineer.");
        f.close();

        FileReader file = new FileReader("input.txt");
        strcount.findword(file, 2);
        file.close();

    }

    private static void findword(FileReader file, int numWords) {

        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\s+|\\.|\\,");
        Map<String, Integer> m = new HashMap<>();
        String str = sc.next();
        while (sc.hasNext()) {
            System.out.println(str);

            if (m.containsKey(str)) {
                Integer count = m.get(str);
                m.put(str, count + 1);
            } else {
                m.put(str, 1);
            }
            str = sc.next();

        }

        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println("key : " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
