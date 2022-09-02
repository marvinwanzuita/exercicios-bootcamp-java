package GamaBootcamp.Exercicios._03_Switch;

import java.util.Scanner;

public class _03_Main {

    public static void main(String[] args) {

        System.out.println("EXERCICIO 03");
        System.out.println("Escrever uma classe, com um atributo int chamado \"mes\". " +
                "Criar um método chamado \"escreverMesExtenso\". Caso o \"mes\" seja " +
                "igual a 1, escrever através de System.out.println a String \"Janeiro\". " +
                "Caso o \"mes\" seja igual a 2, escrever a String \"Fevereiro\", " +
                "e assim por diante. Modificar o valor de \"mes\" para testar várias " +
                "possibilidades.");

        Scanner sc = new Scanner(System.in);

        _03_Mes mes = new _03_Mes();
        int mesDigitado;

        do {
            System.out.println();
            System.out.println("Digite o mês em valor numérico: ");
            mesDigitado = sc.nextInt();
            mes.escreverMesExtenso(mesDigitado);
        } while (!(mesDigitado < 1 || mesDigitado > 12));


    }
}
