import java.util.Scanner;

public class EX12 {
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Me fale o tamanho da raiz quadrada: ");
        int n = leia.nextInt();

        int matriz[][] = new int[n][n];

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 100);

            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Diagonal principal: ");
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(i < j){
                    System.out.print(matriz[i][j] + " ");

                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

    }
}
