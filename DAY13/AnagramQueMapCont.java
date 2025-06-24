package DAY13;

import java.util.ArrayList;
import java.util.HashMap;

class CompareAnagram {
     ArrayList<ArrayList<String>> anagrams(String words[]) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            java.util.Arrays.sort(charArray);
            String key = new String(charArray);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>();    
        for (ArrayList<String> anagramList : map.values()) {
            result.add(anagramList);
        }
        return result;
       }
  
}
public class AnagramQueMapCont {
    public static void main(String[] args) {
        CompareAnagram test = new CompareAnagram();
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<ArrayList<String>> anagrams = test.anagrams(words);
        System.out.println(anagrams);
    }
}
