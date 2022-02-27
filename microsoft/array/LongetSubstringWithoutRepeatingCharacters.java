package array;

import java.util.HashMap;
import java.util.Map;

public class LongetSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)return 0;
        int result = 0;
        int left = 0;
        Map<Character,Integer> map = new HashMap();
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1) ;
            }
            map.put(s.charAt(i),i);
            result = Math.max(result,i-left+1);
        }
        return result;
    }
}
//We use map to save every previous char , left is the next char position of last duplicate char
