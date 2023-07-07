/*
 Questão 4 
4.Coloque em maiúscula a primeira letra de cada frase na string
a. Input "hello. how are you? im fine, thank you.
Output: "Hello. How are you? I'm fine, thank you.”

 */

 //Solução 
public class FormatarTextoMaiusculo {
    public static void main(String[] args) {
        // Cria variável do tipo string e atribui um texto todo minusculo
        String input = "hello. how are you? i'm fine, thank you.";

        StringBuilder output = new StringBuilder(input.length());
        boolean capitalizeNext = true;

        //Esse laço de repetição irá percorrer caracter por caracter e irá verificar se no começo de frase inicio de uma pergunta a primeira letra está maiuscula e devolve o valor final de acordo com a ordem correta da escrita.
        for (char c : input.toCharArray()) {
            if (capitalizeNext && Character.isAlphabetic(c)) {
                c = Character.toUpperCase(c);
                capitalizeNext = false;
            } else if (c == '.' || c == '?' || c == '!') {
                capitalizeNext = true;
            }
            output.append(c);
        }
        System.out.println(output.toString());
    }
}
