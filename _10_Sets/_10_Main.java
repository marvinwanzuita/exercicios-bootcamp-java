package GamaBootcamp.Exercicios._10_Sets;

import java.util.*;

public class _10_Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("EXERCICIO 10-A");
        System.out.println("Criar uma classe \"Repetidos\" com um array de int conforme o exemplo:\n" +
                "int[] repete = { 4, 7, 9, 11, 4, 5, 3, 20, 9, 9, 23 }\n" +
                "Usando HashSet, imprimir os valores acima sem repetições");


        _10_Repetidos numeros = new _10_Repetidos();

        System.out.println();
        numeros.imprimirNaoRepetidos();

        System.out.println();
        System.out.println("EXERCICIO 10-B");
        System.out.println("HashMap\n" +
                "Refazer o exercício 8 de listas, onde tivemos que exibir os nomes de Empregados " +
                "com mais de 20 anos. Dica: não precisamos criar uma classe Empregado para isso, " +
                "podendo usar o nome como chave  (apenas para fins do exercício, um nome nunca seria " +
                "uma boa prática para ser usado como chave)");

        Map<String, Integer> empregados = new HashMap<>(){{
            put("Marvin", 33);
            put("Ana", 35);
            put("Joana", 18);
            put("Diana", 24);
            put("Marina", 19);
        }};

        System.out.println();
        System.out.println("Lista dos empregados com mais de 20 anos:");
        for (Map.Entry<String, Integer> entry : empregados.entrySet()) {
            if (entry.getValue() > 20) {
                System.out.println(entry.getKey());
            }
        }

    }
}
