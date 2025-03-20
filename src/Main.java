public class Main {
    public static void main(String[] args) {

        Anagram anagram = new Anagram();

        if(anagram.isAnagram("listen", "silent")) {
            System.out.println("The two words are anagrams");
        } else {
            System.out.println("The two words are not anagrams");
        }

        if(anagram.isAnagram("apple", "plane")) {
            System.out.println("The two words are anagrams");
        } else {
            System.out.println("The two words are not anagrams");
        }
    }
}
