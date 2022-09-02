package GamaBootcamp.Exercicios._11_Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _11_FilaBanco {

    Queue<String> filaPrioridade = new LinkedList<>();
    Queue<String> filaNormal = new LinkedList<>();

    public _11_FilaBanco(){}

    public void filaBanco(List<String> fila){
        for (int i = 1; i < fila.size(); i++) {
            if (i % 3 == 0){
                filaPrioridade.add(fila.get(i));
            } else {
                filaNormal.add(fila.get(i));
            }
        }
    }


}
