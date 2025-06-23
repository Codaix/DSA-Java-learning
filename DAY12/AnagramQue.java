package DAY12;

import java.util.ArrayList;
//my solution
public class AnagramQue {
        ArrayList<ArrayList<String>> anagrams(String words[]){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[words.length];
        for(int i = 0; i<words.length; i++){
            if(!visited[i]){
                ArrayList<String> newList = new ArrayList<>();
                newList.add(words[i]);
                visited[i] = true;
                for(int j = i+1; j<words.length; j++){
                    if(!visited[j] && isAnagram(words[i], words[j])){
                        newList.add(words[j]);
                        visited[j] = true;
                    }
                }
                ans.add(newList);
            }
        }
        return ans;
    }

        private boolean isAnagram(String string, String string2) {
            throw new UnsupportedOperationException("Unimplemented method 'isAnagram'");
        }
}