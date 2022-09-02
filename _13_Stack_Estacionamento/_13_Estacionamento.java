package GamaBootcamp.Exercicios._13_Stack_Estacionamento;

import java.util.Stack;

public class _13_Estacionamento {

    Stack<String> estacionamento = new Stack<>();
    Stack<String> estacionamentoExtra = new Stack<>();

    public _13_Estacionamento() {}

    public Stack<String> estacionar(Stack<String> carros, Integer tirarCarros){
        tirarCarros = carros.size() - tirarCarros;
        estacionamento = carros;
        for (int i = 1; i <= tirarCarros; i++) {
            estacionamentoExtra.add(estacionamento.pop());
        }
        estacionamento.pop();
        for (int i = 1; i <= tirarCarros; i++) {
            estacionamento.add(estacionamentoExtra.pop());
        }
        return estacionamento;
    }
}
