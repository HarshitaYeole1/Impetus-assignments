import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by harshita on 23/8/16.
 */
public class WordCounter {

    private String filename;
    private int numberOfOccurencesOfWords;
    private Map<String, Integer> map = new HashMap<>();

    private final int MINIMUM_NUMBER_OF_OCCURENCE = 1;
    private final int MAXIMUM_NUMBER_OF_OCCURENCE = 9;
    private final Scanner CONSOLE = new Scanner(System.in);

    public WordCounter(String filename, int numberOfOccurencesOfWords) throws IOException {
        setFilename(filename);
        setNumberOfOccurencesOfWords(numberOfOccurencesOfWords);
        map = findWords();
    }

    public void setFilename(String filename) throws IOException {
        if (!isFileExisting(filename)) {
            throw new FileNotFoundException("THE FILE IS NOT FOUND.");
        }
        if(!isFileADirectory(filename)){
            throw new SecurityException("File name is a directory.");
        }
        if(!isFileEmpty(filename)){
            throw new IOException("The file is empty. Please provide a file with words.");
        }
        this.filename = filename;
    }


    public void setNumberOfOccurencesOfWords(int numberOfOccurencesOfWords) {
        if (numberOfOccurencesOfWords < MINIMUM_NUMBER_OF_OCCURENCE ) {
            throw new IndexOutOfBoundsException("Incorrect number of occurences.");
        }
        this.numberOfOccurencesOfWords = numberOfOccurencesOfWords;
    }

    private boolean isFileEmpty(String fileName) throws IOException {
        File file = new File(fileName);
        if ((file.length() == 0)) {
            return false;
        }
        return true;
    }

    private boolean isFileExisting(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            return false;
        }
        return true;
    }

    private boolean isFileADirectory(String fileName) throws SecurityException {
        File file = new File(fileName);
        if (file.isDirectory()) {
            return false;
        }
        return true;
    }

    public Map<String, Integer> findWords() throws FileNotFoundException{

        File file =new File(filename);
            Scanner sc = new Scanner(file);
//              sc.useDelimiter("\\s+|\\.\\s|\\,\\s+|\\;|\\s+|\\\\s'+|\\.|\\,|\\:|\\;+");
                sc.useDelimiter("\\W\\s");
                while (sc.hasNext()) {
                    String str = sc.next();
                    str = str.toLowerCase().trim();             //to ignore cases
                    if (!str.isEmpty()) {
                        if (map.containsKey(str)) {          //if key already exists in map
                            Integer count = map.get(str);    //get its value
                            map.put(str, count + 1);         //increment value and store the key-value
                        } else {
                            map.put(str, 1);                 //if key does not exist add key-value to map
                        }
                    }
                }
            sc.close();
        return map;
    }

    public void displayWordFrequency(int numberOfOccurences) throws IOException {
        findWords();
        System.out.println("KEY : VALUE");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= numberOfOccurences) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}