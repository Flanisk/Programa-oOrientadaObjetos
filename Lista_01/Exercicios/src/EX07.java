import java.util.Scanner;

public class EX07 {
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha a dimenção de sua matriz: ");
        int n = leia.nextInt();
        int m = leia.nextInt();

        int matriz[][] = new int [n][m];

        for (int i =0; i < matriz.length; i ++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 25);

            }
            System.out.println();

        }

        for (int i =0; i < matriz.length; i ++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");


            }
            System.out.println();

        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){

                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }

                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }

            }
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);


    }
}
