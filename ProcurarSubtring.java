/* 
Questão 3 
3. Encontre a substring palindroma mais longa na string abaixo:
Input: "babad"
Output: "bab” (Observação: pode haver várias saídas válidas, você só precisa
retomar uma delas.)

*/

//Solução
public class ProcurarSubtring {
    public static void main(String[] args) {
        String input = "babad";
        String longestPalindrome = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }
        System.out.println(longestPalindrome);
    }

    private static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }
}
