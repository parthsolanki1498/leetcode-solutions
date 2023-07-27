import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {
    
    public static void main(String[] args) {
        // String input = "abcabcbb";
        Scanner inputScan = new Scanner(System.in);
        String input = inputScan.nextLine();
        inputScan.close();
        System.out.println(longestSubstring(input));
    }

    private static int longestSubstring(String input) {
        int ans = 0;
        int i = -1;
        int j = -1;

        HashMap<Character, Integer> map = new HashMap<>();
        while(true) {
            boolean f1 = false;
            boolean f2 = false;

            while(i < input.length() - 1){
                f1 = true;
                i++;
                char ch = input.charAt(i);
                map.put(ch,map.getOrDefault(ch, 0) + 1);

                if(map.get(ch) == 2){
                    break;
                } else {
                    int length = i - j;
                    if(length > ans){
                        ans = length;
                    }
                }
            }

            while(j < i){
                f2 = true;
                j++;
                char ch = input.charAt(j);
                map.put(ch,map.get(ch) - 1);
                
                if(map.get(ch) == 1){
                    break;
                }
            }

            if(f1 == false && f2 == false){
                break;
            }
        }
        return ans;
    }
}
