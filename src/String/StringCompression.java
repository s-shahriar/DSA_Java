package String;

public class StringCompression {

    public static String compressString(String str) {

        StringBuilder sb = new StringBuilder("");

        if (str.length() == 0) {
            return "";
        }

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            // Check for consecutive characters
            // i < str.length()-1 because i++ is used later
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));

            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbccc";

        String ans = compressString(str);

        System.out.println("Provided String : "+str);
        System.out.println("ans : " + ans);
    }
}

/*
         +--------------------------------------------+
         |                 START                      |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | INPUT: String str                          |
         | Example: str = "aaabbccc"                  |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Check if string length is 0                |
         | If true, return empty string               |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Initialize StringBuilder sb                |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Loop through string to find consecutive    |
         | characters and count their occurrences     |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Append character to StringBuilder sb       |
         | If count > 1, append count to sb as well   |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Return the compressed string              |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |                   END                      |
         +--------------------------------------------+
*/
