package LISTA7.C;

import java.util.Stack;

public class OrdenadorPilha {
    public static Stack<Integer> ordenarPilha(Stack<Integer> pilha) {
        Stack<Integer> pilhaOrdenada = new Stack<>();

        while (!pilha.isEmpty()) {
            int temp = pilha.pop();

            while (!pilhaOrdenada.isEmpty() && pilhaOrdenada.peek() > temp) {
                pilha.push(pilhaOrdenada.pop());
            }

            pilhaOrdenada.push(temp);
        }

        return pilhaOrdenada;
    }

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(5);
        pilha.push(2);
        pilha.push(7);
        pilha.push(3);
        pilha.push(1);

        Stack<Integer> pilhaOrdenada = ordenarPilha(pilha);

        System.out.println("Pilha ordenada em ordem crescente:");
        while (!pilhaOrdenada.isEmpty()) {
            System.out.println(pilhaOrdenada.pop());
        }
    }
}
