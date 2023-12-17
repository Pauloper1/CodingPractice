package CodingNinjas.ProblemOfTheDay.Moderate;

public class palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
    }
    public static boolean isPalindrome(String a){
		if(a.length() < 1){
            return true;
        } else {
            if(a.charAt(0) == a.charAt(a.length() - 1)){
                return isPalindrome(a.substring(1, a.length() - 1));
            } else {
                return false;
            }
        }
	}
}
