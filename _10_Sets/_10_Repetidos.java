package GamaBootcamp.Exercicios._10_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _10_Repetidos {

    Integer[] repete = { 4, 7, 9, 11, 4, 5, 3, 20, 9, 9, 23 };

    Set<Integer> naoRepetidos = new HashSet<>(Arrays.asList(repete));

    public void imprimirNaoRepetidos(){
        System.out.println(naoRepetidos.toString());
    }
}
