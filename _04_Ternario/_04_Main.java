package GamaBootcamp.Exercicios._04_Ternario;

import java.util.Scanner;

public class _04_Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("EXERCICIO 04");
        System.out.println("Reescrever o exercício 1 de if-else com o operador ternário\n" +
                "Escrever uma classe, com um atributo int chamado \"salario\". " +
                "Criar um método chamado \"informaValorImposto\". Caso o salario seja " +
                "maior que 5000, retornar 15. Caso contrário, retornar 5");

        Scanner sc = new Scanner(System.in);

        _04_Salario salario = new _04_Salario();

        System.out.println();
        System.out.println("Digite o valor do salário: ");
        int valorImposto = salario.informaValorImposto(sc.nextDouble());

        System.out.println("O valor do imposto é: " + valorImposto);


    }
}
