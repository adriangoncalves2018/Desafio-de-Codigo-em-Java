/* Questão 5
 5. Verifique se a string é um anagrama de um palíndromo:
a. input “racecar”
b. Output: true
(Atenção Um anagrama de "racecar” pode formar um palíndromo: “racecar”
Observação: Para todos os itens você pode presumir que a string de entrada conterá apenas
caracteres alfabéticos, espaços e sinais de pontuação. A saída para cada tarefa deve ser retornada como string.
 */

 //Solução 
public class Anagrama {
    public static void main(String[] args) {
        //Declara uma variável so tipo string e atribui um valor do tipo texto para ela 
        String input = "racecar";

        //cria variável do tipo boolean e recebe como parametro a variável input do tipo string
        boolean isAnagramOfPalindrome = isAnagramOfPalindrome(input);
        System.out.println(isAnagramOfPalindrome);
    }
    // Criar um método do tipo static e verifica se o texto digitado na string input é verdadeira, sendo assim retornará true para caso for anagrama e false se caso não for.
    private static boolean isAnagramOfPalindrome(String str) {
        int[] charCount = new int[26];
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                charCount[index]++;
            }
        }
        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        return true;
    }
}
