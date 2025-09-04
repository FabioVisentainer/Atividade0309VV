package aula.JavaFx;

import solucaoAnagrama.AnagramaVerificador;
import solucaocifra.CifraDeCesar;

public class Main {
    public static void main(String[] args) {
        AnagramaVerificador.saoAnagramas("Anagrama", "Anagrama");
      
        CifraDeCesar.cifra_de_cesar("zz", 2);
    }
}