package solucaofrase;

public class Frase {

    public static void encontrarMaiorFrase(String frase) {
        String[] palavras = frase.split("\\s+");
        String maior = "";

        for (String p : palavras) {
            // Remove vírgulas, pontos etc.
            p = p.replaceAll("[^a-zA-Zá-úÁ-Ú]", "");
            if (p.length() > maior.length()) {
                maior = p;
            }
        }
        System.out.println("A maior palavra da frase '"+ frase + "' é: " + maior);
    }

}
