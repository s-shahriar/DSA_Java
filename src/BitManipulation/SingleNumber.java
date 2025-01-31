package BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int number = 0;

        for (int i = 0; i < nums.length; i++) {
            number = number ^ nums[i];
        }

        System.out.println("The single number is: " + number);
    }
}


/*
         +--------------------------------+
         |            START               |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Input: An array 'nums'        |
         |  Example: nums = [4,1,2,1,2]   |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Initialize number = 0         |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Loop through each element in  |
         |  nums and XOR with number      |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Output: The single number     |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |            END                 |
         +--------------------------------+
*/
