package GamaBootcamp.Exercicios._01_Ex;

import java.util.Scanner;

public class _01_Main {

    public static void main(String[] args) {

        System.out.println("EXERCICIO 01");
        System.out.println("Escrever uma classe, com um atributo int chamado \"salario\". " +
                "Criar um método chamado \"informaValorImposto\". " +
                "Caso o salario seja maior que 5000, retornar 15. " +
                "Caso contrário, retornar 5.");

        Scanner sc = new Scanner(System.in);

        _01_Salario salario = new _01_Salario();

        System.out.println();
        System.out.println("Digite o valor do salário: ");
        int valorImposto = salario.informaValorImposto(sc.nextDouble());

        System.out.println("O valor do imposto é: " + valorImposto);


    }

}

