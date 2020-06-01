package easy.PalindromeNumber9;

/**
 *Determine whether an integer is a palindrome.
 *An integer is a palindrome when it reads the same backward as forward.
 *
 * Examples --> (121 - true) (257 - false) (125521 - true) (7 - true)
 *
 * @author Gevorg Mkrtchyan
 */
class Solution {
    public boolean isPalindrome(int x) {
        int reminder = 0;
        int numToCheck = 0;
        int temp = x;
        while(x >=1){
            reminder = x % 10;
            numToCheck = numToCheck * 10 + reminder;
            x = x / 10;
        }
        return numToCheck == temp;
    }
}
