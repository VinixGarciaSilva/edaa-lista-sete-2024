package LISTA7.D;

import java.util.Collections;
import java.util.Stack;

public class Ordenacao {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(75);
        stack.push(4);
        stack.push(412);
        stack.push(999);
        stack.push(2);
        stack.push(7);

        ordenacao(stack);

        System.out.println("Números ordenados: " + stack);
        System.out.println("Maior número: " + maior(stack));
        System.out.println("Menor número: " + menor(stack));
        System.out.println("Média Aritmetica: " + media(stack));
    }

    public static void ordenacao(Stack<Integer> stack) {
        Collections.sort(stack);
    }

    public static int maior(Stack<Integer> stack) {
        return Collections.max(stack);
    }

    public static int menor(Stack<Integer> stack) {
        return Collections.min(stack);
    }

    public static int media(Stack<Integer> stack) {
        int soma = 0;
        for (int numeros : stack) {
            soma += numeros;
        }

        return soma / stack.size();
    }
}