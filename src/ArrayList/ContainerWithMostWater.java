package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        List<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int lp = 0;
        int rp = height.size()-1;
        int maxWater = 0;

        while(lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int water = ht * width;
            maxWater = Math.max(maxWater, water);

            if(height.get(lp) > height.get(rp)) {
                rp--;
            } else {
                lp++;
            }
        }


        System.out.println(maxWater);
    }
}
