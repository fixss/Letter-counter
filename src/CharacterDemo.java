
import java.lang.*;

public class CharacterDemo {

    public static void main(String[] args) {

        // create 2 char primitives ch1, ch2
        char ch1, ch2;

        // assign values to ch1, ch2
        ch1 = '.';
        ch2 = ',';

        // create 2 boolean primitives b1, b2
        boolean b1, b2;

        // check if ch1, ch2 are letter or not and assign results to b1, b2
        b1 = Character.isLetter(ch1);
        b2 = Character.isLetter(ch2);

        String str1 = ch1 + " is a letter is " + b1;
        String str2 = ch2 + " is a letter is " + b2;

        // print b1, b2 values
        System.out.println( str1 );
        System.out.println( str2 );
    }
}