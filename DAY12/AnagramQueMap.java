package DAY12;
//solution using tree map
import java.util.ArrayList;
import java.util.TreeMap;    
public class AnagramQueMap {
    // Function to group anagrams together
    // Time Complexity: O(n * m * log m) where n is the number of words and m is the maximum length of a word
    // Space Complexity: O(n * m)
    ArrayList<ArrayList<String>> anagrams(String words[]) {
        TreeMap<String, ArrayList<String>> map = new TreeMap<>();
        for (String word : words) {
            // Sort the characters of the word to create a key
            char[] charArray = word.toCharArray();
            java.util.Arrays.sort(charArray);
            String key = new String(charArray);
            
            // If the key is not present in the map, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // Add the original word to the list corresponding to the sorted key
            map.get(key).add(word);
        }   
        // Prepare the result list from the map values
        ArrayList<ArrayList<String>> result = new ArrayList<>();    
        for (ArrayList<String> anagramList : map.values()) {
            result.add(anagramList);
        }
        return result;


       }
}