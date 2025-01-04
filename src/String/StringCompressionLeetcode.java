package String;

import java.util.Arrays;

public class StringCompressionLeetcode {

    public static int compress(char[] str) {
        StringBuilder sb = new StringBuilder("");


        for (int i = 0; i < str.length; i++) {
            int count = 1; // Count of consecutive characters

            while (i < str.length - 1 && str[i] == str[i + 1]) {
                count++;
                i++;
            }

            sb.append(str[i]);

            // Append the count if it's greater than 1
            if (count > 1) {
                sb.append(count);
            }
        }

        // Replace the character array with the compressed string
        String compressed = sb.toString();
        for (int i = 0; i < compressed.length(); i++) {
            str[i] = compressed.charAt(i);
        }

        return compressed.length();
    }
    public static void main(String[] args) {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(chars);

        System.out.println("Provided Character Array : "+ Arrays.toString(chars));
        System.out.println("Compressed Length: " + newLength);
    }
}

/*
         +--------------------------------------------+
         |                 START                      |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | INPUT: Character Array (e.g. ['a', 'a', 'b', 'b', 'c', 'c', 'c'])|
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Initialize StringBuilder sb as an empty string |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Loop through the character array:         |
         | 1. For each character, check if consecutive|
         |    characters are the same (count them).   |
         | 2. Append the character to sb.             |
         | 3. If count > 1, append the count as well. |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Create a compressed string from StringBuilder sb |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Copy compressed string back into the char[]|
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Return the compressed string length.      |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |                   END                      |
         +--------------------------------------------+
*/
