package Day4_DSA;


public class Valid_Palindrome
{
    public static void main(String[] args)
    {
        Valid_Palindrome vp = new Valid_Palindrome();
        String s = "A man, a plan, a canal: Panama";

        boolean result  = vp.isPalindrome(s);
        System.out.println("Result for Valid_Palindrome:- " + result);
    }

    public boolean isPalindrome(String s)
    {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        System.out.println("String:- " + s);
        System.out.println("reverse:- " + reverse);

        if(s.equals(reverse) || s.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
