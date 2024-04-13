package LISTA7.Dois;

import java.util.Stack;

public class ConversorNumerico {
    private int numero;

    public ConversorNumerico(int numero) {
        this.numero = numero;
    }

    public String converterParaBinario() {
        return converter(2);
    }

    public String converterParaOctal() {
        return converter(8);
    }

    public String converterParaHexadecimal() {
        return converter(16);
    }

    private String converter(int base) {
        Stack<Integer> pilha = new Stack<>();
        int num = this.numero;
        while (num > 0) {
            pilha.push(num % base);
            num = num / base;
        }

        StringBuilder sb = new StringBuilder();
        while (!pilha.isEmpty()) {
            sb.append(digitoParaChar(pilha.pop()));
        }

        return sb.toString();
    }

    private char digitoParaChar(int digito) {
        if (digito >= 0 && digito <= 9) {
            return (char) (digito + '0');
        } else {
            return (char) (digito - 10 + 'A');
        }
    }

    public static void main(String[] args) {
        ConversorNumerico conversor = new ConversorNumerico(456);

        System.out.println("Decimal: 456");
        System.out.println("Binário: " + conversor.converterParaBinario());
        System.out.println("Octal: " + conversor.converterParaOctal());
        System.out.println("Hexadecimal: " + conversor.converterParaHexadecimal());
    }
}
