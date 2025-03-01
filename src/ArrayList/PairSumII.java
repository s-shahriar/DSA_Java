package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class PairSumII {
    public static boolean pairSumII(List<Integer> list, int target) {

        // first find the breaking point / pivot element
        int bp = -1 ; // let invalid index
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1; // smallest
        int rp = bp; // largest

        while (lp != rp) {

            if(list.get(lp)+list.get(rp) == target){
                return true;
            }

            if(list.get(lp)+list.get(rp) > target){
                rp = (n+rp-1) % n;
            } else {
                lp = (lp+1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSumII(list, target));
    }
}
