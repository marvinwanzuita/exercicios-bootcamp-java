package GamaBootcamp.Exercicios._11_Queue;

import java.util.ArrayList;
import java.util.List;

public class _11_Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("EXERCICIO 11");
        System.out.println("Queue");
        System.out.println("Crie uma classe que implemente um algoritmo de fila de banco, " +
                "considerando os nomes dos clientes. Você deve considerar duas filas: normal e " +
                "prioridade. Para cada 2 atendimentos normais é realizado 1 de prioridade. " +
                "Utilize LinkedList. Trate possíveis exceções.");

        List<String> fila = new ArrayList<>();
        fila.add("Marvin");
        fila.add("Jose");
        fila.add("Mario");
        fila.add("Roberto");
        fila.add("Antonio");
        fila.add("Joana");
        fila.add("Ana");
        fila.add("Andressa");
        fila.add("Joelma");

        _11_FilaBanco filaBanco = new _11_FilaBanco();

        filaBanco.filaBanco(fila);

        System.out.println();
        System.out.println("Fila normal: ");
        System.out.println(filaBanco.filaNormal);

        System.out.println();
        System.out.println("Fila preferencial: ");
        System.out.println(filaBanco.filaPrioridade);


    }
}
