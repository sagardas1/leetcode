package leedcodeEasy;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeat {
    public char repeatedCharacter(String s) {
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.add(c)){}else{
                return c;
            }
        }
        return 0;
    }
}
