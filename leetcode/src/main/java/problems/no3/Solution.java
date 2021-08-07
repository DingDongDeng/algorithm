package problems.no3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        SubstringCover substringCover = new SubstringCover(s);
        return substringCover.lengthOfLongestSubstring();
    }

}

class SubstringCover {
    private final Map<Character, Character> characterKindMap = new HashMap<>();
    private final List<Character> substring = new ArrayList<>(); //ArrayList가 더 좋은 성능으로 확인(LinkedList vs ArrayList)
    private int maxSubStringSize = 0;
    private char[] chars;

    public SubstringCover(String s){
        this.chars = s.toCharArray();
    }

    public int lengthOfLongestSubstring(){
        for (int i = 0; i < chars.length; i++) {
            Character character = chars[i];
            Character indexOfSubString = characterKindMap.get(character);
            if (Objects.isNull(indexOfSubString)) {
                insertTarget(character);
            } else {
                deleteTarget(character);
                insertTarget(character);
            }
            maxSubStringSize = Integer.max(substring.size(), maxSubStringSize);
        }

        return maxSubStringSize;
    }
    private void insertTarget(Character character){
        characterKindMap.put(character, character);
        substring.add(character);
    }

    private void deleteTarget(Character character){
        int targetIndex = 0;
        for (int i = 0; i < substring.size(); i++) {
            characterKindMap.remove(substring.get(i));
            if(character.equals(substring.get(i))){
                targetIndex = i+1;
                break;
            }
        }
        substring.subList(0,targetIndex).clear();
    }
    
    
}