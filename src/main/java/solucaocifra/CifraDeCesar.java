package solucaocifra;

import java.util.ArrayList;
import java.util.Arrays;

public class CifraDeCesar {
    public static void cifra_de_cesar(String texto, int deslocamento){
        // Mapeamento do alfabeto Minusculo
        ArrayList<String> alfabetoMinusculo = new ArrayList<>(
                Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h",
                        "i", "j", "k", "l", "m", "n", "o", "p",
                        "q", "r", "s", "t", "u", "v", "w", "x",
                        "y", "z")
        );
        // Mapeamento do alfabeto Maiusculo
        ArrayList<String> alfabetoMaiusculo = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D" ,"E" ,"F" ,"G" , "H",
                        "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                        "S", "T", "U", "V", "W", "X", "Y", "Z")
        );

        StringBuilder resultado = new StringBuilder(); // preciso instanciar essa classe para a string vazia

        // Contagem do tamanho do texto
        int tamanhoTexto = texto.length();

        for (int i = 0; i < tamanhoTexto; i++) {
            char letter = texto.charAt(i); // pego a letra do meu texto
            String letraStr = String.valueOf(letter); // letra da string

            // verifico se a letra esta no alfabeto esta no alfabeto maiusculo
            if (alfabetoMinusculo.contains(letraStr)) {
                int pos = alfabetoMinusculo.indexOf(letraStr); // índice da letra
                // aplica o deslocamento
                int novaPos = (pos + deslocamento) % 26; // o modulo de 26 pois ele voltar para o começo do alfabeto quando passa de 25.
                resultado.append(alfabetoMinusculo.get(novaPos));

            } else if (alfabetoMaiusculo.contains(letraStr)) { //
                int pos = alfabetoMaiusculo.indexOf(letraStr); // índice da letra
                int novaPos = (pos + deslocamento) % 26;
                resultado.append(alfabetoMaiusculo.get(novaPos));

            } else {
                // mantem caracteres que não são letras tipo espaco ou pontuacoes
                resultado.append(letter);
            }
        }

        // mostra no terminal o texto enviado e o resultado
        System.out.println("Texto original: " + texto);
        System.out.println("Texto cifrado : " + resultado);
    }

}
