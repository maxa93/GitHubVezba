import java.util.ArrayList;
import java.util.Locale;

public class CountSpecificCharacterInArray {
    public static void main (String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("apple");
        arr.add("tree");
        arr.add("fire");
        countChars("e",arr);
    }
    public static void countChars(String str, ArrayList<String>list){
        int count = 0;
        for(String ex:list){
            if(ex.toLowerCase().endsWith(str.toLowerCase())) count++;
        }
        System.out.println("count=" + count);
    }
}

