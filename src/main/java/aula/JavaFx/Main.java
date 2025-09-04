package aula.JavaFx;

import solucaoAnagrama.AnagramaVerificador;
import solucaocifra.CifraDeCesar;
import solucaofrase.Frase;

public class Main {
    public static void main(String[] args) {
        AnagramaVerificador.saoAnagramas("Anagrama", "Anagrama");
        Frase.encontrarMaiorFrase("O rato roeu a roupa do rei de roma");
        Frase.encontrarMaiorFrase("A jornada de mil milhas começa com um único passo.");
        Frase.encontrarMaiorFrase("Seja forte e corajoso");
        Frase.encontrarMaiorFrase("999 999 ");
        Frase.encontrarMaiorFrase("      ");
        CifraDeCesar.cifra_de_cesar("zz", 2);
    }
}