import java.util.Scanner;

public class EX09 {
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz: ");
        int n = leia.nextInt();

        int matriz[][] = new int [n][n];

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 100);

            }
            System.out.println();

        }

        System.out.println("matriz normal: ");
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();


        }

        System.out.println();
        System.out.println("Diagonal principal: ");
        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");

        }


    }
}
