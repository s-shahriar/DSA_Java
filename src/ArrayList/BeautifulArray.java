package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeautifulArray {
    public static int[] beautifulArray(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        while(ans.size() < n){
            List<Integer> temp = new ArrayList<>();

            // for odd elements
            for(int el : ans){
                if((2*el)-1 <=n){
                    temp.add((2*el)-1);
                }
            }

            // for even elements
            for(int el : ans){
                if((2*el) <=n){
                    temp.add((2*el));
                }
            }

            ans = temp;
        }

        int[] res = new int[n];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int n =4;
        int[] ans = beautifulArray(n);
        System.out.println(Arrays.toString(ans));
    }
}
