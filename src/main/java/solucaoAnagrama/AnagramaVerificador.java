package solucaoAnagrama;

public class AnagramaVerificador {

    public static boolean saoAnagramas(String string1, String string2) {
        if (string1 == null || string2 == null) {
            return false;
        }

        String s1 = string1.replaceAll("\\s+", "").toLowerCase();
        String s2 = string2.replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }
}

