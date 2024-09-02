package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] input = {"eAt","tea","tan","ate","nat","bat"};
        if(input != null && input.length > 0){
            for(int i=0;i<input.length;i++){
                String frequencyString = createFrequencyString(input[i]);
            }
        }
        System.out.println("List is empty");
    }

    private static String createFrequencyString(String input) {

        char ch='a';
        if(input != null && input.length() != 0){

        }
        char[] chars = input.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }
}

class AnagramConsumer implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s!=null || s.length() !=0;
    }
}