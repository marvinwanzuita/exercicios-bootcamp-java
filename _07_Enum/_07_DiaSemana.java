package GamaBootcamp.Exercicios._07_Enum;

public enum _07_DiaSemana {

    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);

    private int dia;

    _07_DiaSemana(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }
}
