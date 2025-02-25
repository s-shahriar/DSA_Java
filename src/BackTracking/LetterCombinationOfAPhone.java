package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfAPhone {
    public static List<String> letterCombinations(String digits) {
        StringBuilder temp = new StringBuilder();
        List<String> res = new ArrayList<>();
        Map<Character, String> mp = new HashMap<>();
        mp.put('1', "abc");
        mp.put('2', "def");
        mp.put('3', "ghi");
        mp.put('4', "jkl");
        mp.put('5', "mno");
        mp.put('6', "pqrs");
        mp.put('7', "tuv");
        mp.put('8', "wxyz");
        mp.put('9', "abc");
        solve(0,digits,res,temp,mp);
        return res;
    }

    public static void solve(int idx, String digits, List<String> res, StringBuilder temp, Map<Character,String> mp) {
        // base
        if (idx >= digits.length()) {
            res.add(temp.toString());
            return;
        }

        char ch = digits.charAt(idx);
        String str = mp.get(ch);

        for(int i =0; i<str.length(); i++){
            temp.append(str.charAt(i));
            solve(idx+1,digits,res,temp,mp);
            temp.deleteCharAt(temp.length()-1);
        }

    }



    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinations(digits);
        System.out.println(result);
    }
}
