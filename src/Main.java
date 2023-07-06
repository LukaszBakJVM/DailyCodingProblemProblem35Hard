import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    private static Character[]characters={'G', 'B', 'R', 'R', 'B', 'R', 'G'};
    public static void main(String[] args) {
        Character[] sort = sort(characters);
        for (Character c:sort) {
            System.out.println(c);

        }

    }
    private static Character[]sort(Character[]letters){
        Character []sorted=new Character[letters.length];
        List<Character> characterList = Arrays.stream(letters).sorted(Collections.reverseOrder()).toList();
        for (int i = 0; i < sorted.length; i++) {
            sorted[i]=characterList.get(i);

        }

   return sorted;
    }

}




