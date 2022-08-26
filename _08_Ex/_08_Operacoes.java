package GamaBootcamp.Exercicios._08_Ex;

public enum _08_Operacoes {

    ADICAO,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO;


    public static double operacoes(String operacao, Integer... numeros){
        operacao = operacao.toUpperCase();
        double resultado = 0;
        switch (_08_Operacoes.valueOf(operacao)){
            case ADICAO:
                resultado = adicao(numeros);
                break;
            case SUBTRACAO:
                resultado = subtracao(numeros);
                break;
            case MULTIPLICACAO:
                resultado = multiplicacao(numeros);
                break;
            case DIVISAO:
                resultado = divisao(numeros);
                break;
        }
        return resultado;
    }


    private static double adicao(Integer... numeros){
        double total = 0;
        for (Integer n : numeros) {
            total += n;
        }
        return total;
    }

    private static double subtracao(Integer... numeros){
        double total = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            total -= numeros[i];
        }
        return total;
    }

    private static double multiplicacao(Integer... numeros){
        double total = 1;
        for (Integer n : numeros) {
            total *= n;
        }
        return total;
    }

    private static double divisao(Integer... numeros){
        double total = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            total /= numeros[i];
        }
        return total;
    }





}
