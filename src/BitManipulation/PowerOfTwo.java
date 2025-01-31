package BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 17;

        if (number > 0 && (number & (number - 1)) == 0) {
            System.out.println("Power of Two");
        } else {
            System.out.println("Not Power of Two");
        }
    }
}

/*
         +--------------------------------+
         |            START               |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Input: A number 'n'           |
         |  Example: n = 17               |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         | Check if n > 0                 |
         +--------------------------------+
                        |
             +----------+----------+
             |                     |
          Yes (n > 0)           No (n ≤ 0)
             |                     |
             v                     v
 +--------------------------------------+
 | Compute (n & (n - 1)) == 0           |
 | If true, print "Power of Two"        |
 | Else, print "Not Power of Two"       |
 +--------------------------------------+
                        |
                        v
         +--------------------------------+
         |            END                 |
         +--------------------------------+
*/

