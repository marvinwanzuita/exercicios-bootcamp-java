package GamaBootcamp.Exercicios._12_Stack;

import java.util.Random;
import java.util.Stack;

public class _12_Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("EXERCICIO 12");
        System.out.println(" Crie uma classe que usa a classe Stack como pilha. " +
                "Insira alguns números inteiros nessa pilha. Escreva um método que, " +
                "dado um número n qualquer, remova esses n elementos (incluindo o n). " +
                "Tratar possíveis exceções. Imprima o resultado após essa remoção");

        Random random = new Random();
        Stack<Integer> pilhaNumeros = new Stack<>();

        Integer tamanhoPilha = random.nextInt (11,20);
        for (int i = 0; i < tamanhoPilha; i++) {
            pilhaNumeros.push(random.nextInt(20));
        }

        System.out.println();
        System.out.println("Tamanho da pilha: " + tamanhoPilha);

        System.out.println("Pilha criada: ");
        System.out.println(pilhaNumeros);

        _12_Pilha pilha = new _12_Pilha(pilhaNumeros);

        System.out.println();
        Integer numeroAleatorio = random.nextInt(1,10);
        System.out.println("Quantidade de números para remover da pilha: " + numeroAleatorio);
        System.out.println("Número para remover tambem após remoção: " + numeroAleatorio);
        pilha.removerNumeros(numeroAleatorio);

        System.out.println("Pilha final:");
        System.out.println(pilha.pilhaNumeros);


    }
}
