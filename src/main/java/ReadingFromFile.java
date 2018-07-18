import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadingFromFile {

    public static void main(String [] args) throws FileNotFoundException{

        File file = new File("TestFile2");
        ArrayList<String> wordsList = new ArrayList<String>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            wordsList.add(scanner.next().toString());
        }


        System.out.println(wordsList);
        System.out.println(wordsList.size());
        Collections.sort(wordsList);
        System.out.println("Сортировка по алфавиту" + wordsList);

        String list1[] = new String[wordsList.size()];
        list1 = wordsList.toArray(list1);
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> words = new HashSet<String>(Arrays.asList(list1));
        int count = 0;
        for (String word : words) {
            for (String temp : list1) {
                if (word.equals(temp)) {
                    ++count;
                }
            }
            map.put(word, count);
            count = 0;
        }
        System.out.println("Слова встречаются в тексте следующее количество раз:");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        int maxValueInMap = (Collections.max(map.values()));  // This will return max value in the Hashmap
        System.out.println("Чаще всего повторяется слово:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {  // Iterate through hashmap
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());     // Print the key with max value
            }
        }
    }
}







