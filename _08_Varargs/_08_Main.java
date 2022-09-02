package GamaBootcamp.Exercicios._08_Varargs;

public class _08_Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("EXERCICIO 08");
        System.out.println(" Criar um método chamado \"calcular\" que recebe um parâmetro " +
                "varargs com números inteiros. Esse método também deverá receber como " +
                "parâmetro uma das 4 operações (soma, subtração, multiplicação, divisão " +
                "- dica: pode ser um enum). De acordo com essa opção, percorrer todos os " +
                "valores informados e executar a operação, retornando o total.");

        System.out.println();
        System.out.println("ADIÇÃO");
        double resultadoAdicao = _08_Operacoes.operacoes("adicao", 1,2,3,4,5);
        System.out.println(resultadoAdicao);

        System.out.println();
        System.out.println("SUBTRAÇÃO");
        double resultadoSubtracao = _08_Operacoes.operacoes("subtracao", 10, 5, 3, 2);
        System.out.println(resultadoSubtracao);

        System.out.println();
        System.out.println("MULTIPLICAÇÃO");
        double resultadoMultiplicacao = _08_Operacoes.operacoes("multiplicacao", 10, 5, 3, 2);
        System.out.println(resultadoMultiplicacao);

        System.out.println();
        System.out.println("DIVISÃO");
        double resultadoDivisao = _08_Operacoes.operacoes("divisao", 30, 5, 3);
        System.out.println(resultadoDivisao);

    }


}
