import java.util.Scanner;

public class EX03 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        int [][] matriz;
        int n;

        do {
            System.out.println("Escreva a quantidade do tamanho da matriz entre 1 a 20: ");
            n = leia.nextInt();

            if (n < 1 || n > 20){
                System.out.println("quantidade inválida!! ");
            }

        } while (n < 1 || n > 20);

        matriz = new int [n][n];

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
