import java.util.Scanner;

public class matrizFlavio {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas e colunas: ");
		int n = leia.nextInt();
		int m = leia.nextInt();
		
		int par = 0;
		int impar = 0;
		
		int iPar = 0;
		int iImpar = 0;
		
		int matriz[][] = new int[n][m];
		
		System.out.println("Matriz:" + "[" + n + "] [" + m + "]");
		
		for(int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){
				matriz[i][j] = (int)(Math.random() * 100);
				
				if (matriz[i][j] % 2 ==0){
					par++;
					
				} else {
					impar++;
					}
				
			}
			System.out.println();
			
		}
		
		System.out.println("A sua matriz: ");
		for (int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j] + " ");
				
				}
			System.out.println();
			
			}
			
			
			System.out.println("\nPares: " + par);
			System.out.println("\nimpares: " + impar);
			
			
			if (par > 0) {
				int vetorPar[] = new int[par];
				
				for(int i = 0 ; i < matriz.length; i++){
					for(int j = 0; j < matriz[i].length; j++){
						
						if (matriz[i][j] % 2 == 0){
							
							vetorPar[iPar] = matriz[i][j];
							
							System.out.print(vetorPar[iPar] + " ");
							
							iPar++;
							}
						}
					
					
				}
			} else {
					System.out.println("Nao existe: ");
				
				}
		
		
	}
}


