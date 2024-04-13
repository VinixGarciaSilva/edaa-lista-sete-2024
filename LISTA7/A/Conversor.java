
package LISTA7.A;

public class Conversor {
    public static String invertePalavras(String texto) {
        StringBuilder textoInvertido = new StringBuilder();

        for (String palavra : texto.split(" ")) {
            StringBuilder palavraInvertida = new StringBuilder(palavra).reverse();
            textoInvertido.append(palavraInvertida).append(" ");
        }

        return textoInvertido.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(invertePalavras("ESTE EXERCÍCIO É MUITO FÁCIL."));
    }
}
