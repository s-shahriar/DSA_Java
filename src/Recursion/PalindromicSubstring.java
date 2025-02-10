package Recursion;

public class PalindromicSubstring {
    public static int countSubstrings(String s){
        int count = 0;
        for(int i =0; i< s.length(); i++){
            // for odd palindrome
            count+= PalindromicSubstrings(s, i, i);
            // for even palindrome
            count+= PalindromicSubstrings(s, i, i+1);
        }

        return count;
    }

    public static int PalindromicSubstrings(String str, int left, int right){
        int count = 0;

        while(left >= 0 && right <= str.length()-1 && str.charAt(left) == str.charAt(right)){
            count ++;
            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "aaa";
        System.out.println("Provided String = " + str);
        int ans = countSubstrings(str);
        System.out.println("Number of Palindromic Substrings = " + ans);
    }
}


/*
          +-------------------+
          |     Start         |
          +-------------------+
                    |
                    v
        +----------------------+
        | Initialize count = 0  |
        +----------------------+
                    |
                    v
        +-----------------------------+
        | FOR i = 0 to s.length - 1   |
        +-----------------------------+
                    |
                    v
        +--------------------------------+
        | count += PalindromicSubstrings |
        |         (s, i, i)              |
        +--------------------------------+
                    |
                    v
        +--------------------------------+
        | count += PalindromicSubstrings |
        |         (s, i, i+1)            |
        +--------------------------------+
                    |
                    v
          +-----------------+
          | Return count    |
          +-----------------+
                    |
                    v
                +-------+
                | End   |
                +-------+

 */