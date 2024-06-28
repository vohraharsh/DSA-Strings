//Lecture 2 - Basics of Strings

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String s1 = scn.next();
        char ch = scn.next().charAt(0);

        //System.out.println(isPalindrome(s1));
        //System.out.println(lowercase(s1));

        //int ans[] = countVowelsAndConsonants(s1);
        //System.out.println(ans[0]);
        //System.out.println(ans[1]);

        System.out.println(replaceChar(s1,ch));
    }

    static boolean isPalindrome(String s1){
        String rev = new String("");

        for(int i = s1.length()-1; i>=0; i--){
            char ch = s1.charAt(i);
            rev = rev + ch;
        }

        if(rev.equals(s1)){
            return true;
        } else {
            return false;
        }
    }

    static String lowercase(String s1){
        String ans = new String("");
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            char newch = (char) (ch + 32);
            ans = ans + newch;
        }
        return ans;
    }

    static int[] countVowelsAndConsonants(String str){
        int v = 0;
        int c = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v++;
            }
        }
        c = str.length() - v;
        int ans[] = {v,c};
        return ans;
    }


    static String replaceChar (String str, char ch){

        String s = new String("");

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == ch){
                s = s + '$';
            } else {
                s = s + c;
            }
        }
        return  s;
    }

}
