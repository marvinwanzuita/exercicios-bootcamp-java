package GamaBootcamp.Exercicios._12_Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class _12_Pilha {

    Stack<Integer> pilhaNumeros = new Stack<>();

    public _12_Pilha(Stack<Integer> pilhaNumeros) {
        this.pilhaNumeros = pilhaNumeros;
    }

    public Stack<Integer> removerNumeros(Integer quantidade){

        try {
            for (int i = 0; i < quantidade; i++) {
                pilhaNumeros.pop();
            }
            for (int i = 0; i < pilhaNumeros.size(); i++) {
                if (pilhaNumeros.contains(quantidade)){
                    pilhaNumeros.remove(quantidade);
                }
            }
        }
        catch (EmptyStackException e){
            System.out.println(e.getMessage());
        }

        return pilhaNumeros;
    }
}
