import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffle_array {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list.add(i);
        }  
        Collections.shuffle(list);
        System.out.println("Shuffled array: " + list);
    }
}
