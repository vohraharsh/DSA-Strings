//Lecture 1 - Basic of Strings

public class One {
    public static void main(String[] args) {

        char ch = 97;
        System.out.println(ch);
        // integer value into character printing ascii value that is associated with that integer

        char ch1 = 'a';
        System.out.println((int)ch1);
        char ch2 = 'c';
        System.out.println((int)ch2);
        // character into ascii value conversion

        int val = 'a' + 'c';
        System.out.println(val);
        // Addition is happening - it will treat a = ascii value and c = ascii value and then add it
        //97 + 99 = 196

        int val2 = 'B';
        System.out.println(val2);
    }
}