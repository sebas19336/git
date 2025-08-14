public class utilidades {

    public static int[][] llenarmtrz(int[][] mtrz) {
        for (int i = 0; i < mtrz.length; i++) {
            for (int j = 0; j < mtrz[i].length; j++) {
                mtrz[i][j] = (int) (Math.random() * 100);
            }
        }
        return mtrz;
    }

    public static int[][] mostrarmtrz(int[][] mtrz) {
        System.out.println("La mtrz generada es: ");
        for (int i = 0; i < mtrz.length; i++) {
            for (int j = 0; j < mtrz[i].length; j++) {
                System.out.print(mtrz[i][j] + "\t");
            }
            System.out.println();
        }
        return mtrz;
    }

    public static int[][] numerosDivisiblesPorDos(int[][] mtrz) {
        System.out.println("Los números divisibles por dos son:");
        for (int i = 0; i < mtrz.length; i++) {
            for (int j = 0; j < mtrz[i].length; j++) {
                if (mtrz[i][j] % 2 == 0) {
                    System.out.print(mtrz[i][j] + "\t");
                }
            }
        }
        System.out.println();
        return mtrz;
    }
    public static int[][] sumaNumerosmtrz(int[][] mtrz)
    {
        int acum=0;
        System.out.println("la suma interna de la matriz es:");
        for (int i = 0; i < mtrz.length; i++) 
        {
            for (int j = 0; j < mtrz.length; j++) 
            {
                    acum=acum+mtrz[i][j];
                    
            }   
        }
    }
}   


