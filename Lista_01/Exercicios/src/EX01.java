public class EX01 {
    public static void main (String[] args){

        int [][] matriz = new int[4][5];

        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;
        matriz[0][3] = 40;
        matriz[0][4] = 40;

        matriz[1][0] = 50;
        matriz[1][1] = 60;
        matriz[1][2] = 70;
        matriz[1][3] = 80;
        matriz[1][4] = 40;

        matriz[2][0] = 50;
        matriz[2][1] = 60;
        matriz[2][2] = 70;
        matriz[2][3] = 80;
        matriz[2][4] = 40;

        matriz[3][0] = 50;
        matriz[3][1] = 60;
        matriz[3][2] = 70;
        matriz[3][3] = 80;
        matriz[3][4] = 40;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
