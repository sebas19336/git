import java.util.Scanner;

public class primario {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        utilidades ut = new utilidades();
        System.out.println("ingrese el tamaño de la matriz:");
        int n;
        n=sc.nextInt();
        int m[][]=new int[n][n];
        m=ut.llenarMatriz(m);
        ut.mostrarMatriz(m);
        ut.numerosDivisiblesPorDos(m);

    }
}

