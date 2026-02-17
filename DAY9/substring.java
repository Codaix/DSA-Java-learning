package DAY9;

import java.util.*;
class solution{

    String getSubstring(String s){
        int freq = 0;
        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                freq = map.get(c);
            }

            map.put(c, map.getOrDefault(c, freq) + 1);
        }
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(freq == 1){
                ans += c;
            }
        }
        return ans;
    }
}
class substring{
    public static void main(String[] args) {
        solution s = new solution();
        String str = "abcabcbb";
        System.out.println(s.getSubstring(str));
    }
}