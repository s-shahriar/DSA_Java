package Recursion;

public class RemoveDuplicatesFromStrings {
    public static void removeDuplicates(String str, int idx, boolean[] map, StringBuilder newStr) {
        if(idx == str.length()) {
            System.out.println("Without duplicates " + newStr);
            return;
        }

        if(map[(str.charAt(idx) - 'a')]){
            removeDuplicates(str, idx+1, map, newStr);
        } else {
            map[(str.charAt(idx) - 'a')] = true;
            removeDuplicates(str, idx+1, map, newStr.append(str.charAt(idx)));
        }
    }

    public static void main(String[] args) {
        String str = "doppelganger";
        boolean[] map = new boolean[26];
        System.out.println("Provided String: " + str);
        removeDuplicates(str, 0, map, new StringBuilder());
    }
}

/*
          +-------------------+
          |     Start         |
          +-------------------+
                    |
                    v
        +---------------------------+
        | If idx == str.length?      |
        +---------------------------+
                    |
              Yes /   \ No
                 /     \
         +--------+     v
         | Print  |  +-----------------------+
         | newStr |  | Check if map[str[idx]] |
         +--------+  +-----------------------+
                        |            |
                      Yes            No
                      |              |
                      v              v
           +----------------+  +---------------------+
           | Call recursion |  | Add to newStr       |
           | removeDuplicates|  | Mark in map        |
           +----------------+  +---------------------+
                                     |
                                     v
                             +----------------+
                             | Call recursion |
                             | removeDuplicates|
                             +----------------+
                                     |
                                     v
                                   End

 */