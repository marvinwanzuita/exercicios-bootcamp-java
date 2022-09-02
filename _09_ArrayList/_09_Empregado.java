package GamaBootcamp.Exercicios._09_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class _09_Empregado {

    private String nome;
    private Integer idade;

    private List<_09_Empregado> empregados = new ArrayList<>();

    public _09_Empregado(){}
    public _09_Empregado(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void adicionarEmpregado(String nome, Integer idade){
        _09_Empregado empregado = new _09_Empregado(nome, idade);
        empregados.add(empregado);
    }

    public void listarEmpregados(){
        for (_09_Empregado empregado : empregados) {
            System.out.println(empregado.getNome() + " - " + empregado.getIdade());
        }
    }

    public void listarEmpregadosMaior20Anos(){
        for (_09_Empregado empregado : empregados) {
            if (empregado.getIdade() > 20){
                System.out.println(empregado.getNome() + " - " + empregado.getIdade());
            }

        }
    }

}
