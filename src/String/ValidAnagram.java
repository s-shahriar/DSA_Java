package String;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        int[] countArray = new int[26]; // Array to store the count of each character

        for (int i = 0; i < s.length(); i++) {
            countArray[s.charAt(i) - 'a']++; // Increment the count of each character in the first string
            countArray[t.charAt(i) - 'a']--; // Decrement the count of each character in the second string
        }

        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String str1 = "anagram";
        String str2 = "nagaram";

        System.out.println("Provided Strings : "+str1+" "+str2);
        System.out.println(isAnagram(str1, str2));
    }
}


/*
         +--------------------------------------------+
         |                 START                      |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | INPUT: Strings s and t                    |
         | Example: s = "anagram", t = "nagaram"     |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Check if length of s != length of t        |
         | If true, return false (not an anagram)     |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Initialize countArray of size 26 (to store |
         | counts of each character from 'a' to 'z') |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Loop through each character of both strings|
         |    - Increment countArray for s            |
         |    - Decrement countArray for t            |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Check if any value in countArray is not 0  |
         | If true, return false (not an anagram)     |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Return true (strings are anagrams)         |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |                   END                      |
         +--------------------------------------------+
*/
