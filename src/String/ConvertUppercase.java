package String;

public class ConvertUppercase {
    public static String convertToUppercase(String str){

        StringBuilder sb = new StringBuilder("");

        // Handle first letter
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Start from second letter
        for (int i = 1; i < str.length(); i++) {

            // Check for space & not last letter (because i++ is used later)
            if (str.charAt(i) == ' ' & i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                // Convert next letter to uppercase
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Hi, I am java ";

        String ans = convertToUppercase(str);

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
         | INPUT: String `str`                        |
         | Example: "Hi, I am java"                   |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Initialize `StringBuilder sb` as an empty string |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Handle the first character:                |
         |   Convert the first character to uppercase |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Loop through the string from the second character (i=1) |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | For each character:                        |
         |   - If it is a space and not the last character, append the space |
         |   - Convert the next character to uppercase and append it |
         |   - Else, just append the character as is   |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Return the modified string from StringBuilder |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | PRINT the original string and the result   |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |                   END                      |
         +--------------------------------------------+
*/
