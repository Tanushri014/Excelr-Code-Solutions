
package day5assignment;

public class Count {
    public static void main(String[] args) {

        String s = "ajnjuds47990msxnmhs@#";
        char arr[] = s.toCharArray();

        int vowel_count = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int special_characters = 0;

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowel_count++;

            } else if (Character.isLetter(ch)) {
                consonants++;

            } else if (Character.isDigit(ch)) {
                digits++;

            } else if (ch == ' ') {
                spaces++;

            } else {
                special_characters++;
            }
        }

        System.out.println("Vowels: " + vowel_count);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + special_characters);
    }
}

