package GamaBootcamp.Exercicios._05_Ex;

public class _05_Tabuada {

    public static void tabuadaDe2(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("2 x " + i + " = " + (i * 2) );
        }
    }

    public static void tabuadasDo1ao10(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

}
