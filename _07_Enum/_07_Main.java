package GamaBootcamp.Exercicios._07_Enum;

import java.util.Scanner;

public class _07_Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("EXERCICIO 07");
        System.out.println("Criar uma enum representando os dias da semana");
        System.out.println("Criar uma enum representando os meses, considerando " +
                "o nome do mês e sua ordem, ex.: Janeiro equivale a 1, Fevereiro a 2, etc. " +
                "Escrever um switch onde, a partir do nome do mês, seja devolvido " +
                "qual sua ordem correspondente");
        System.out.println("Usando o enum criado para o exercício 2, fazer um for " +
                "para percorrer as constantes presentes ali");

        Scanner sc = new Scanner(System.in);

        System.out.println();
        _07_DiaSemana dia = _07_DiaSemana.SEGUNDA;
        System.out.println(dia.toString() + " - " + dia.getDia());

        int ordemMes;

        System.out.println();
        System.out.println("Digite o mês para saber a ordem: ");
        String mes = sc.nextLine().toUpperCase();
        ordemMes = _07_Meses.ordemMes(mes);
        System.out.println(ordemMes);

        // MOSTRAR TODA A LISTA DO ENUM SELECIONADO
        System.out.println();
        for (_07_Meses m : _07_Meses.values()) {
            System.out.printf("%s%n", m);
        }

        sc.close();
    }
}
