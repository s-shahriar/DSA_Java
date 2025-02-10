package Recursion;

public class FriendsPairing {
    public static int FriendPairing(int n) {
        if (n == 1 || n == 2) return n;

        // if, single is chosen
        int singleChoice = FriendPairing(n - 1);

        // if, pair is chosen
        int doublePair = (n-1) * FriendPairing(n-2);

        return singleChoice + doublePair;

    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(FriendPairing(number));
    }
}

/*
              +------------------+
              |      Start       |
              +------------------+
                        |
                        v
          +-------------------------+
          |  IF n == 1 OR n == 2?    |
          +-------------------------+
                        |
             +----------+----------+
             |                     |
            Yes                    No
             |                      |
        +------------+    +-------------------------+
        |  RETURN n  |    |  singleChoice = F(n-1)  |
        +------------+    |  doublePair = (n-1) * F(n-2) |
                          +-------------------------+
                                      |
                                      v
                          +--------------------+
                          |  RETURN singleChoice +  |
                          |         doublePair      |
                          +--------------------+
                                      |
                                      v
                                +------------+
                                |    End     |
                                +------------+

 */