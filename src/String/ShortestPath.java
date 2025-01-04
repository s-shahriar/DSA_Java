package String;

public class ShortestPath {

    public static float shortestPath(String path) {
        int length = path.length();
        float ans = 0;

        // initial coordinates
        int x = 0;
        int y = 0;

        for (int i = 0; i < length; i++) {
            char ch = path.charAt(i);

            if (ch == 'W') x--; // move west
            else if (ch == 'N') y++; // move north
            else if (ch == 'E') x++; // move east
            else y--; // move south
        }


        int x2 = x*x; // x^2
        int y2 = y*y; // y^2

        ans = (float) Math.sqrt(x2+y2);

        return ans;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        float ans = shortestPath(path);

        System.out.println("Provided String : "+path);
        System.out.println("Shortest Path = " + ans);
    }
}


/*
         +--------------------------------------------+
         |                 START                      |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | INPUT: Path string `path`                  |
         | Example: "WNEENESENNN"                     |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Initialize x = 0, y = 0                   |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Loop through the string `path` from i=0 to length-1 |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | For each character `ch` in path:           |
         |    - If ch == 'W', decrease x by 1 (move West)  |
         |    - If ch == 'E', increase x by 1 (move East) |
         |    - If ch == 'N', increase y by 1 (move North) |
         |    - If ch == 'S', decrease y by 1 (move South) |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Calculate the distance from (0,0) using:   |
         |    ans = sqrt(x^2 + y^2)                   |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | PRINT the shortest path distance (ans)     |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |                   END                      |
         +--------------------------------------------+
*/
