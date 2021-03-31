package collections;

import java.io.*;
import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/file1"))) {
            int maxCount = 0;
            List<String> listFromFile = new ArrayList<>();

            while (bufferedReader.ready()) {
                listFromFile.add(bufferedReader.readLine());           // чтение строк
            }

            Map<String, Integer> statistic = new HashMap<>();
            List<String> listFromFile2 = new ArrayList<>();
            for (String element : listFromFile) {
                String[] strArr = element.trim().split(" ");
                for (String word : strArr) {
                    listFromFile2.add(word);
                    if (!statistic.containsKey(word)) {                // в HashMap
                        statistic.put(word, 0);
                    }
                    statistic.put(word, statistic.get(word) + 1);
                }
            }
            for (int count : statistic.values()) {                     // Поиск макс кол-ва
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            Map<String, Integer> maxCountWords = new HashMap<>();
            for (Map.Entry<String, Integer> entry : statistic.entrySet()) {
                if(entry.getValue() == maxCount){
                    maxCountWords.put(entry.getKey(), entry.getValue());
                }
            }
            System.out.println("Слова из файла: " + listFromFile2.toString());
            Collections.sort(listFromFile2);
            System.out.println("Слова в алфавитном порядке.: " + listFromFile2.toString());
            System.out.println("Статистика" + statistic);
            System.out.println("Максимальным количеством повторений" + maxCountWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
