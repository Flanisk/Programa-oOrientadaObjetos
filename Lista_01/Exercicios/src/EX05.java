import java.util.Scanner;

public class EX05 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        int [][] matrizN;
        int [][] matrizM;
        int [][] matrizO;

        System.out.println("Entre com o valor das matrizes: ");
        int n = leia.nextInt();
        int m = leia.nextInt();

        matrizN = new int [n][m];

        for (int i = 0; i < matrizN.length; i++){
            for (int j = 0; j < matrizN[i].length; j++){
                matrizN[i][j] = (int)(Math.random() * 100);

            }
            System.out.println();

        }

        System.out.println("Valor da matriz N");

        for (int i = 0; i < matrizN.length; i++){
            for (int j = 0; j < matrizN[i].length; j++){
                System.out.print(matrizN[i][j] + " ");
            }
            System.out.println();

        }

        /*----------------------------------------------------*/

        matrizM = new int [n][m];

        System.out.println();
        System.out.println("Valor da matrizM");

        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j < matrizM[i].length; j++){
                matrizM[i][j] = (int)(Math.random() * 100);

            }
            System.out.println();

        }

        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j < matrizM[i].length; j++){
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();

        }

        /*----------------------------------------------------*/

        matrizO = new int [n][m];

        System.out.println();
        System.out.println("Valor da matrizO");

        for (int i = 0; i < matrizO.length; i++){
            for (int j = 0; j < matrizO[i].length; j++){
                matrizO[i][j] = matrizN[i][j] + matrizM[i][j];

            }
            System.out.println();

        }

        for (int i = 0; i < matrizO.length; i++){
            for (int j = 0; j < matrizO[i].length; j++){
                System.out.print(matrizO[i][j] + " ");
            }
            System.out.println();

        }




    }
}
