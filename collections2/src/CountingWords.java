import java.util.HashMap;
import java.util.Map;

public class CountingWords {
    public static void main(String[] args) {
        String[] words = {"john", "sam", "john", "mj", "sam", "sam", "mj"};

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words)
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
    }
}
