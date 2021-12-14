package StringChanllenges;

import java.util.Arrays;

public class ReverseString {


    public void reverseString(String str) {

        //1. Using for loop and StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char temp = str.charAt(i);
            stringBuilder.append(temp);
        }
        System.out.println(stringBuilder);
    }

    public void reverseStringWithSpacesIntact(String str) {

        // 1. get the index position of spaces.
        //2. reverse a string and if the index matches the space index then make a space in the reverse string.

        char[] resultArray = new char[str.length()];
        char[] inputArray = str.toCharArray();

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                resultArray[i] = ' ';
            }
        }
        int n = resultArray.length-1;
        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] != ' ') {
                if (resultArray[n] == ' ') {
                n--;
                }
                resultArray[n] = inputArray[i];
                n--;
            }
        }

        System.out.println("Reverse of String with spaces Intact: " + Arrays.toString(resultArray));
    }
}

class ReversalStringMain {

    public static void main(String[] args){

        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("Sandeep");
        reverseString.reverseStringWithSpacesIntact("I am sandeep");

    }
}