
package CollectionFramework.PracticePrograms;

import javax.tools.SimpleJavaFileObject;
import java.util.*;

public class FirstCharacterOnce {

  static Character firstCharacter(String sentence) {
     Map<Character, Integer> map = new LinkedHashMap<>();
     for (char c:sentence.toCharArray()) {
         map.put(c, map.getOrDefault(c, 0) + 1);
     }
     for(Map.Entry<Character, Integer> entry:map.entrySet())
     {
         if(entry.getValue().equals(1))
         {
             return entry.getKey();

         }
     }
//      System.out.println(map.values());
//      System.out.println(map);
     return '\0';
 }

    public static void main(String[] args) {
        System.out.println(firstCharacter("daabbcc"));
    }
}
