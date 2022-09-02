package GamaBootcamp.Exercicios._02_Condicional;

public class _02_PeriodoDia {

    private int hora;

    public void verificaPeriodo(int hora){

        if (hora >= 0 && hora < 6){
            System.out.println("Madrugada");
        } else if (hora >= 6 && hora < 12) {
            System.out.println("Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Tarde");
        } else if (hora >= 18 && hora < 24) {
            System.out.println("Noite");
        } else {
            System.out.println("Hora inválida");
        }

    }
}
