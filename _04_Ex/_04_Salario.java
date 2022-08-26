package GamaBootcamp.Exercicios._04_Ex;

public class _04_Salario {

    private int salario;

    public _04_Salario() {}

    public int informaValorImposto(double salario) {
        return salario > 5000 ? 15 : 5;
    }
}
