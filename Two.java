//Lecture 1 - Basic of Strings

public class Two {
    public static void main(String[] args) {

        //String str = "Hello World!";
        //System.out.println(str.length());
        // It will give the length of the string!

        //System.out.println(str.charAt(7));
        // it will find a char at a particular index

        //Q Given a string, count total number of uppercase letter and return that
        String str = "CoDinG";
        System.out.println(countUpperCase(str));

        //Q Given a string, write a function that returns reverse of string
        System.out.println(reverseString(str));
    }

    static int countUpperCase(String str){
        int ans = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <='Z')
            // if(ch >= 65 && ch <= 90 - This will also work
                {
                ans++;
            }
        }
        return ans;
    }

    static String reverseString(String str){
        String ans = new String("");
        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            ans = ans + ch;
        }
        return ans;
    }
}
