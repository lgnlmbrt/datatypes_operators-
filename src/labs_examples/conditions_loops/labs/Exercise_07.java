package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */
import java.util.Scanner;
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scanner.nextLine();

        boolean foundFirstVowel = false;
        int charIndex = 0;
        while(foundFirstVowel == false){
            char c = word.charAt(charIndex);
            if(c == 'a'){
                System.out.println(word);
                System.out.println('a');
                foundFirstVowel = true;
            }
            else if(c=='e'){
                System.out.println(word);
                System.out.println('e');
                foundFirstVowel = true;
            }
            else if(c=='i') {
                System.out.println(word);
                System.out.println('i');
                foundFirstVowel = true;
            }
            else if(c=='o') {
                System.out.println(word);
                System.out.println('o');
                foundFirstVowel = true;
            }
            else if(c=='u') {
                System.out.println(word);
                System.out.println('u');
                foundFirstVowel = true;
            }
            else if(charIndex == word.length()){
                break;
            }
            charIndex++;
        }
    }
}
