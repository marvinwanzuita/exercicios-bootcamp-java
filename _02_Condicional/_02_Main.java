package GamaBootcamp.Exercicios._02_Condicional;

import java.util.Scanner;

public class _02_Main {

    public static void main(String[] args) {

        System.out.println("EXERCICIO 02");
        System.out.println("Escrever uma classe, com um atributo int chamado \"hora\"." +
                "Criar um método chamado \"verificaPeriodo\". " +
                "Caso a hora esteja entre 0 e 5, escrever através " +
                "de System.out.println a String \"madrugada\". " +
                "Caso a hora seja maior que 5 e menor que 12, " +
                "escrever \"manhã\". Caso a hora seja maior ou igual " +
                "a 12 e menor que 18, escrever \"tarde\". " +
                "Caso contrário, escrever \"noite\".");

        Scanner sc = new Scanner(System.in);

        _02_PeriodoDia periodoDia = new _02_PeriodoDia();

        System.out.println("Digite a hora: ");
        periodoDia.verificaPeriodo(sc.nextInt());


    }
}
