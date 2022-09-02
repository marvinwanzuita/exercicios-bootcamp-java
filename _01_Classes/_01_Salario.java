package GamaBootcamp.Exercicios._01_Classes;

public class _01_Salario {

    private int salario;

    public _01_Salario() {
    }

    public int informaValorImposto(double salario) {
        if (salario > 5000) {
            return 15;
        } else {
            return 5;
        }
    }
}
