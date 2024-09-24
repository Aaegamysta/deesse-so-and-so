package net.aaegamysta;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map2.putIfAbsent(magazine.charAt(i), 0);
            if(!map2.containsKey(magazine.charAt(i))) {
                map2.put(magazine.charAt(i), 0);
                continue;
            }
            var val = map2.get(magazine.charAt(i));
            val += 1;
            map2.put(magazine.charAt(i), val);
        }
        for (var key: map1.keySet()){
            if(map1.get(key) > map2.getOrDefault(key, 0))
                return false;
        }
        return true;
    }
}
