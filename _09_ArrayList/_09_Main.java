package GamaBootcamp.Exercicios._09_ArrayList;

public class _09_Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("EXERCICIO 09");
        System.out.println("Criar uma classe \"Empregado\" com os atributos nome e idade. " +
                "Criar uma ArrayList que contenha 5 empregados com nome e idade aleatórios. " +
                "Escrever um método que liste esses nomes");
        System.out.println("Usando o mesmo ArrayList do exercício anterior, listar o nome dos " +
                "empregados que tenham mais de 20 anos");


        _09_Empregado empregados = new _09_Empregado();

        System.out.println();
        empregados.adicionarEmpregado("Marvin", 33);
        empregados.adicionarEmpregado("Ana", 35);
        empregados.adicionarEmpregado("Joana", 18);
        empregados.adicionarEmpregado("Diana", 24);
        empregados.adicionarEmpregado("Marina", 19);

        System.out.println();
        System.out.println("LISTAR EMPREGADOS:");
        empregados.listarEmpregados();

        System.out.println();
        System.out.println("EMPREGADOS MAIORES DO QUE 20 ANOS");
        empregados.listarEmpregadosMaior20Anos();

    }
}
