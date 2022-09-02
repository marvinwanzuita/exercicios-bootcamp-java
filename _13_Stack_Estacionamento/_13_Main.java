package GamaBootcamp.Exercicios._13_Stack_Estacionamento;

import java.util.Random;
import java.util.Stack;

public class _13_Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("EXERCICIO 13");
        System.out.println("Crie uma classe que simule um estacionamento. " +
                "Neste estacionamento entram e saem carros pela mesma porta. " +
                "Para remover um carro x é preciso remover todos os inseridos " +
                "após ele. Escrever um método que receba um número inteiro " +
                "representando um carro. Remover todos os carros após o escolhido, " +
                "e voltá-los para o estacionamento. Dica: usar duas pilhas\n" +
                "Exemplo: [carro1, carro2, carro3, carro4, carro5]\n" +
                "removerCarro[2]\n" +
                "[carro1, carro2, carro4, carro5]");

        Random random = new Random();
        Stack<String> carros = new Stack<>();

        Integer totalVagas = random.nextInt(11,20);

        for (int i = 1; i <= totalVagas; i++) {
            carros.add("carro" + i);
        }

        _13_Estacionamento estacionamento = new _13_Estacionamento();

        Integer numeroCarroRetirar = random.nextInt(1,totalVagas);
        carros = estacionamento.estacionar(carros, numeroCarroRetirar);

        System.out.println();
        System.out.println("Número de vagas do estacionamento: " + totalVagas);
        System.out.println("Número do carro para retirar: " + numeroCarroRetirar);

        System.out.println();
        System.out.println("Nova organização do estacionamento: ");
        System.out.println(carros);

    }
}
