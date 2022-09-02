package GamaBootcamp.Exercicios._06_Array;

public class _06_Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("EXERCICIO 06");
        System.out.println("Criar um array de 3 elementos String, atribuindo um nome" +
                "de cidade a cada elemento. Escrever um método que liste esses nomes");

        System.out.println("Criar um array de 5 elementos Integer, atribuindo um valor " +
                "a cada elemento (escolher os valores que quiser). " +
                "Escrever um método que encontre a soma de todos os valores");

        System.out.println("Criar um array de 4 elementos Integer, atribuindo um valor " +
                "diferente a cada elemento (escolher os valores que quiser). " +
                "Escrever um método que encontre o menor valor dessa array");

        String cidades[] = {"Blumenau", "Floripa", "Joinville"};
        System.out.println();
        listarCidades(cidades);

        int numeros[] = {5, 15, 25, 30, 50};
        System.out.println();
        somarNumeros(numeros);

        int numeros2[] = {15, 9, 21, 30};
        System.out.println();
        menorNumero(numeros2);

    }

    public static void listarCidades(String cidades[]) {
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }

    public static void somarNumeros(int numeros[]){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    public static void menorNumero(int numeros[]){
        int menorNumero = numeros[0];
        for (int numero : numeros) {
            if(numero < menorNumero){
                menorNumero = numero;
            }
        }
        System.out.println(menorNumero);
    }

}
