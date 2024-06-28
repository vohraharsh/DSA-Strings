//Lecture 1 - Intermediate of Strings

public class Four {
    public static void main(String[] args) {
        char [] s = {'A', 'n', 'd'};
        char[] toggled = toggleCharacter(s);

        // Printing the toggled characters
        for (char c : toggled) {`
            System.out.print(c);
        }
    }

    static char[] toggleCharacter (char s[]) {
        char nch[] = new char[s.length]; // Array to store toggled characters

        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                nch[i] = (char) (s[i] + 32); // Convert to lowercase
            } else if (s[i] >= 'a' && s[i] <= 'z') {
                nch[i] = (char) (s[i] - 32); // Convert to uppercase
            } else {
                nch[i] = s[i]; // Leave the character as is if it's not a letter
            }
        }
        return nch; // Return the array of toggled characters
    }
}
