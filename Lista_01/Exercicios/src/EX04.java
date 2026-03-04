import java.util.Scanner;

public class EX04 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        int [][] matriz;
        int n;
        int m;

        n = (int)(Math.random() * 20);
        m = (int)(Math.random() * 20);

        matriz = new int [n][m];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 100);

            }

            System.out.println();

        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }


    }
}
