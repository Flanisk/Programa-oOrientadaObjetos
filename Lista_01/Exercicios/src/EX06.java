import java.util.Scanner;

public class EX06 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha a dimenção de sua matriz: ");
        int n = leia.nextInt();
        int m = leia.nextInt();
        int contador = 0;

        System.out.println("Digite um numero que vc queira que seja mostrado: ");
        int numero = leia.nextInt();

        int matriz[][] = new int [n][m];

        for (int i =0; i < matriz.length; i ++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 25);

                if (numero == matriz[i][j]){
                    contador++;
                }

            }
            System.out.println();

        }

        for (int i =0; i < matriz.length; i ++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("A quantidade de vezes que o numero que vc digitou é: " + contador);

    }
}
