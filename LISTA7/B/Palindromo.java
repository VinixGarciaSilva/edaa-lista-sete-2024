package LISTA7.B;

import java.util.Scanner;
import java.util.Stack;

public class Palindromo {
    public static boolean ePalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        StringBuilder palavraInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }

        return palavra.equalsIgnoreCase(palavraInvertida.toString());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira uma palavra:");
            String palavra = scanner.nextLine();
            System.out.println(ePalindromo(palavra));
        }
    }
}
