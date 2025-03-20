import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String word1, String Word2) {

        if(word1.length() != Word2.length()) {              // if the length of the two words are not equal, they can't be anagrams
            return false;
        }

        char[] word1Array = word1.toCharArray();            // convert the words to char arrays
        char[] word2Array = Word2.toCharArray();

        Arrays.sort(word1Array);                            // sort the char arrays
        Arrays.sort(word2Array);

        return Arrays.equals(word1Array, word2Array);
    }
}
