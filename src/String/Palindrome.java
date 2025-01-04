package String;

public class Palindrome {

    public static boolean checkPalindrome(String str){
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != str.charAt(length-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        String str = "racecar";
        Boolean ans = checkPalindrome(str);

        System.out.println("Provided String : "+ str);
        System.out.println("ans = " + ans);
    }
}

/*
         +--------------------------------------------+
         |                 START                      |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | INPUT: String `str`                        |
         | Example: "racecar"                          |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Initialize `length` = str.length()         |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Loop through the string from i=0 to i<length |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | For each character at position i and (length-1-i): |
         |    - If characters at i and (length-1-i) are not equal |
         |      return `false` (string is not a palindrome)       |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Return `true` (string is a palindrome)         |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | PRINT the original string and result (true/false)  |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |                   END                      |
         +--------------------------------------------+
*/
