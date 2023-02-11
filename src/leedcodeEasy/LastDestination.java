package leedcodeEasy;

import java.util.HashMap;
import java.util.List;
import java.util.*;

public class LastDestination {
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
