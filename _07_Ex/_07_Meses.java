package GamaBootcamp.Exercicios._07_Ex;

public enum _07_Meses {

    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);

    private int mes;

    _07_Meses(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public static int ordemMes(String mesExtenso){
        mesExtenso = mesExtenso.toUpperCase();
        int ordemMes = 0;
        switch (_07_Meses.valueOf(mesExtenso)){
            case JANEIRO:
                ordemMes = 1;
            break;
            case FEVEREIRO:
                ordemMes = 2;
                break;
            case MARCO:
                ordemMes = 3;
                break;
            case ABRIL:
                ordemMes = 4;
                break;
            case MAIO:
                ordemMes = 5;
                break;
            case JUNHO:
                ordemMes = 6;
                break;
            case JULHO:
                ordemMes = 7;
                break;
            case AGOSTO:
                ordemMes = 8;
                break;
            case SETEMBRO:
                ordemMes = 9;
                break;
            case OUTUBRO:
                ordemMes = 10;
                break;
            case NOVEMBRO:
                ordemMes = 11;
                break;
            case DEZEMBRO:
                ordemMes = 12;
                break;
            default:
                ordemMes = 0;
        }
        return ordemMes;
    }

}
