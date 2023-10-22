package String;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2= t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        int i = 0;
        int j = str1.length-1;
        while(i<=j){
            if(str1[i]!=str2[i]){
                return false;
            }
            if(str1[j]!=str2[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
